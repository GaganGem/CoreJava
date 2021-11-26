package exercise4;

public class LargestInArray {
	public static void main(String[] args) {
		int[] a = {11, 33, 24, 5, 168, 44, 951};
		int res = findLargest(a);
		System.out.println(res);
		
	}
	
	
	public static int findLargest(int[] ar){
		int max=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
	}
}
