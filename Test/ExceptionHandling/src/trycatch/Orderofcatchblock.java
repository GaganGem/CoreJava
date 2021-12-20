package trycatch;

public class Orderofcatchblock {
	public static void main(String[] args) {
		String g = "palak";
		try {
			System.out.println(g.length());
			System.out.println(g.charAt(7));
			
		}catch (StringIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			
		}catch(RuntimeException e) {
			System.err.println("error"+e.getMessage());
		}
	}

}
