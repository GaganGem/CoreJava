package trycatch;

public class Tryexcercise {
	public static void main(String[] args) {
		int k = 8;
		int i = 0;
		try {
			try {
				double div = k / i;
				System.out.println(div);
			} catch (ArithmeticException e) {
				System.out.println("divided by zero");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
