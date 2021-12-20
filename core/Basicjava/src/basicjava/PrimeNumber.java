package basicjava;
 
public class PrimeNumber {
public static void main(String[] args) {
	int number=29, i =2;
	boolean p = false;
	for (i=2;i<=number/2;i++)
		if(number%i==0 ) {
				p= true;
			break;
	}

	if (!p)
		System.out.println(p);

}
}
