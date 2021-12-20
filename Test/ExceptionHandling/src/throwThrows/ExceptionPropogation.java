package throwThrows;

public class ExceptionPropogation {
	public static void main(String[] args) throws LoginException {
		
	authenticate ("palak");
	System.out.println("invalid id/password");
	}
private static void authenticate (String login) throws LoginException {
if (!"admin".equals(login)) {
		LoginException P = new LoginException();
     throw P;
}}
} 