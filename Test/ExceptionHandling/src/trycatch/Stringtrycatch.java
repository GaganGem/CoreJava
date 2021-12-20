package trycatch;

public class Stringtrycatch {
	public static void main(String[] args) {
		String p = "palak";
		String g = null;
		
		try {
			System.out.println("length of name is"+p.length());
			System.out.println("charter of 6th position is"+p.charAt(6));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("string is small");
		}catch (NullPointerException e) {
			System.out.println("bakwas name");
		}finally {
			System.out.println("nothing");
		
			
			
		}
				
	}

}
