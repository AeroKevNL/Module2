package ss.week3.hotel;

public class BillTest {
	private Bill b;
	private Item Eten;
	private Item Drinken;
	private Item Toetje;
	
	public static void main(String[] arg){
		BillTest t = new BillTest();
		t.runTest();
	}
	
	public void runTest() {
		setUp();
		addItem(Eten);
		addItem(Drinken);
		printSum();
		addItem(Toetje);
		close();
	}
	
	public void setUp(){
		b = new Bill(1);
	}
	
	public void addItem(Item item) {
		b.newItem(item);
	}
	
	public void printSum(){
		System.out.println(b.getSum());
	}
	
	public void close(){
		b.close();
	}
}
