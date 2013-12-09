package ss.week2.hotel;

public class SafeTest {	
	public Safe safe;
	public Safe safe2;
	public Safe safe4;
	public Safe safe5;
	
	public void runTest() {
		setUp();
		activateSafe();  
		openSafe();
		closeSafe();
		deactivateSafe();
	}
	
	public void setUp() {
		safe = new Safe("NewPass");
		safe2 = new Safe("NewPass2");
		safe4 = new Safe("New Pass");
		safe5 = new Safe("NewP");
	}
	
	public void activateSafe() {
		System.out.println("Expected: Safe Activated!");
		safe.activate("NewPass");
		System.out.println("Expected: Wrong Password!");
		safe2.activate("WrongPass");
	}
	
	public void openSafe() {
		System.out.println("Expected: Wrong Password!");
		safe.open("WrongPass");
		System.out.println("Expected: Safe Opened");
		safe.open("NewPass");
		System.out.println("Expected: The Safe isn't activated...");
		safe2.open("NewPass2");
	}
	
	public void closeSafe() {
		System.out.println("Expected: Safe Closed!");
		safe.close();
		System.out.println("Expected: Safe is already closed!");
		safe2.close();
	}
	
	public void deactivateSafe(){
		System.out.println("Expected: Safe Deactivated!");
		safe.deactivate();
		System.out.println("Expected: The Safe isn't activated...");
		safe2.deactivate();
	}
	
	public static void main(String[] args){
		SafeTest safe3 = new SafeTest();
		safe3.runTest();
	}

}
