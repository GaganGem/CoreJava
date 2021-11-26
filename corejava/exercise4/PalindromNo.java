package exercise4;

public class PalindromNo {
	public static void main(String[] args) {
		int num = 121, res = 0, rev = 0,temp;
		temp= num;
		while (temp != 0) {
			res = temp % 10;
			rev = rev * 10 + res;
			temp = temp / 10;
		}
		System.out.println(rev);
		if (num == rev) {
			System.out.println("A palindrome No");
		} else {
			System.out.println("Not A palindrome No");
		}
	}

}
