package exercise4;

public class FiboSeries {
	public static void main(String[] args) {
		int a = 0, b = 1, res = 0;
		for (int i = 0; i < 10; i++) {
			
			res = a + b;
			a = b;
			b = res;
			System.out.println(res);
		}
	}
}
