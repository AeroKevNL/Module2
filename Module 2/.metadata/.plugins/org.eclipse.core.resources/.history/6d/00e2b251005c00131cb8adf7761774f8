package ss.week3.hotel;

public class Format {

	public static String printLine(String text, double amount) {
		String output;
		if (text.length() >= 8) {
			String text1 = "";
			while (text.length() >= 8) {
				text1 = text1 + "\n" + text.substring(0, 6);
				text = text.substring(7);
			}
			output = String.format("%s\t%10.2f", text1, amount);
		}
		else{
			output = String.format("%s\t%10.2f", text, amount);
		}
		return output;
	}
}
