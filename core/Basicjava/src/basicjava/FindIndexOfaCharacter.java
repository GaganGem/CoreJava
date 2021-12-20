package basicjava;

public class FindIndexOfaCharacter {

	public static void main(String[] args) {

		String s = "Vijay Dinanath Chouhan";

		char[] ch = s.toCharArray();
	
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a') {
				System.out.println(i + "    " + ch[i]);
			}
		}

	}

}
