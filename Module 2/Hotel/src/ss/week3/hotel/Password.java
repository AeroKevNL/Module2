package ss.week3.hotel;

public class Password {
	public static final java.lang.String INITIAL = "Password123";
			
	String pass;
	
	public Password() {
		this.pass = INITIAL;
	}
	
	public boolean acceptable(String suggestion) {
		return (suggestion.length() >= 6 && suggestion.contains(" ") == false);
	}
	
	public boolean testWord(String test) {
		return (test.equals(pass));
	}
	
	public boolean setWord(String oldpass, String newpass) {
		if(testWord(oldpass) && acceptable(newpass)){
			pass = newpass;
			return true;
		}
		else return false;
	}
}

