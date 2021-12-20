package basicjava;

public class Reverse {
	public static void main(String[] args) {
		String str = "palak";
		char[] x = str.toCharArray();
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i]);
		}

	}

}
