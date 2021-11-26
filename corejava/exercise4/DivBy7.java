package exercise4;

public class DivBy7 {
	public static void main(String[] args) {
		int a = 100, b = 200, sum=0;

		for (int i = a; i < b; i++) {
			if (i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
