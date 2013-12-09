package ss.week3.hotel;

public class BasicChecker implements Checker {
	
	public static final String INITIAL = "Password";
	
	public boolean acceptable(java.lang.String suggestion) {
		return (suggestion.length() >= 6 && suggestion.contains(" ") == false);
	}
	
	public String generatePass() {
		return INITIAL;
	}
}
