package exercise4;

public class AvrOddAndEven {
	public static void main(String[] args) {
		int fst= 1,lst=10,aeven=0,aodd=0;
		int totale=0,totalo=0;
		for (int i = fst; i <= lst; i++) {
			if (i%2==0) {
				aeven+=i;
				totale++;
			} else {
				aodd+=i;
				totalo++;
			}
		}
		System.out.println((double)aeven/totale);
		System.out.println((double)aodd/totalo);
	}
}
