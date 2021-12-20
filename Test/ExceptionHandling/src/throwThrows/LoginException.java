package throwThrows;

public class LoginException extends Exception{
	public LoginException() {
		super("invalid id/password");
		}
	}

