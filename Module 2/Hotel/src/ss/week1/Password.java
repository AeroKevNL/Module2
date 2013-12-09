package ss.week1;

public class Password {
	public static final java.lang.String INITIAL = "Password123";
			
	String pass;
	
	public Password() {
		this.pass = INITIAL;
	}
	
	public boolean acceptable(java.lang.String suggestion) {
		return (suggestion.length() >= 6 && suggestion.contains(" ") == false);
	}
	
	public boolean testWord(java.lang.String test) {
		return (test.equals(pass));
	}
	
	public boolean setWord(java.lang.String oldpass, java.lang.String newpass) {
		if(testWord(oldpass) && acceptable(newpass)){
			pass = newpass;
			return true;
		}
		else return false;
	}
}

