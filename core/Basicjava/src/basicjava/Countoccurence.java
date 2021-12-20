package basicjava;

public class Countoccurence {
		public static void main(String[] args) {
			String s="Palak Karodia";
			char c='P';
			int count=0;
			for (int i=0;i<s.length();i++) {
				if (s.charAt(i)==c) {
					count++;
				}
			}
			System.out.println(count);
		}

	}