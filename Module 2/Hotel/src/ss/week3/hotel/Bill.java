package ss.week3.hotel;

public class Bill {
	private java.io.PrintStream output;
	private double sum;

	public Bill(java.io.PrintStream theOutStream) {
		this.output = theOutStream;
		System.setOut(output);
	}

	public void close() {
		System.out.println("___________________");
		System.out.println(Format.printLine("Sum:", getSum()));
	}

	public double getSum() {
		return sum;
	}

	public void newItem(Item item) {
		if (output == null) return;
		else {
			sum = sum + item.getAmount();
			System.out.println(item);
		}
	}
	
	public interface Item {
		public double getAmount();
	}
}
