package ss.week3.hotel;

public class StrongChecker extends BasicChecker {
	
	public boolean strongAcceptable(java.lang.String suggestion) {
		return (acceptable(suggestion) && 
				Character.isDigit(suggestion.charAt(suggestion.length() - 1)) && 
				Character.isLetter(suggestion.charAt(0)));
	}
	
	public String generatePass() {
		return INITIAL + 1;
	}
}
