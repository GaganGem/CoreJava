package basicjava;

public class Stringmethods{

	public static void main(String[] args) {
		String p = new String("Gupta Palak Karodia");
		System.out.println("StringLength"+p.length());
		System.out.println(p.charAt(6));
		System.out.println(p.indexOf("Pal"));
		System.out.println(p.indexOf("k"));
		System.out.println(p.lastIndexOf("o"));
		System.out.println(p.replace("a","A"));
		System.out.println(p.replaceAll("P","L"));
		System.out.println(p.toLowerCase());
	System.out.println(p.toUpperCase());
System.out.println(p.startsWith(p));
System.out.println(p.endsWith("dia"));
System.out.println(p.substring(6));

	}

}
