package ss.week2.hotel;

public class Safe {
	private boolean isActiveVar;
	private boolean isOpenVar;
	
	public Password pass = new Password();
	public Password pass2 = new Password();
	
	//@ requires newpass.length() >= 6;
	public Safe(String newpass){
		assert(pass.acceptable(newpass));
		pass.setWord("Password123",newpass); 
		pass2.setWord("Passwdsdsdord123",newpass);
	}
	
	public void activate(String trypass) {
		if(!pass.testWord(trypass)) System.out.println("Wrong Password!");
		else System.out.println("Safe Activated!");
		isActiveVar = pass.testWord(trypass);
	}
	
	public void deactivate() {
		if(isActiveVar){
			isActiveVar = false;
			System.out.println("Safe Deactivated!");
		}
		else System.out.println("The Safe isn't activated...");
	}
	
	public void open(String trypass) {
		if(!pass.testWord(trypass)) System.out.println("Wrong Password!");
		else if(isActive()){
			System.out.println("Safe Opened!");
			isOpenVar = true;
		}
		else System.out.println("The Safe isn't activated...");
	}
	
	public void close() {
		if(isOpen()){
			isOpenVar = false;
			System.out.println("Safe Closed!");
		}
		else System.out.println("Safe is already closed!");
	}
	
	/* pure */ public boolean isActive() { return isActiveVar; }
	
	/* pure */ public boolean isOpen() { return isOpenVar; }
}