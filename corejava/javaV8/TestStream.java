package javaV8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class TestStream {
	private String name;
	private String phone;

	public TestStream(String a, String b) {
		name = a;
		phone = b;
	}

	public static void main(String[] args) {

		ArrayList<TestStream> list = new ArrayList<TestStream>();

		list.add(new TestStream("gagan", "8871958211"));
		list.add(new TestStream("jaidf", "7171958633"));
		list.add(new TestStream("gajs", "2271982697"));
		list.add(new TestStream("ladi", "4446782315"));
		list.add(new TestStream("gaahdf", "84554871958211"));
		list.add(new TestStream("skjfk", "8871951"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
