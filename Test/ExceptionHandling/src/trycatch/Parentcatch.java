package trycatch;

public class Parentcatch {
	public static void main(String[] args) {
		

	String n = "lakshya";
	try {
		System.out.println(n.length());
		System.out.println(n.charAt(9));
	}
	
    catch (StringIndexOutOfBoundsException e) {
    System.out.println("string is small right now");
    }
	catch(RuntimeException e1 ) {
		System.out.println("baks");		
} 
	finally {
		System.out.println("pagal");
	
	
}
}}