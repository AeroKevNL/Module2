package ss.week3.hotel;

import ss.week3.hotel.Password;

public class Safe {
	private boolean active;
	private boolean open;

	public Password pass = new Password();
	
	public Safe(String newpass) {
		pass.setWord("Password123", newpass);
	}
	
	public void activate(String trypass) {
		if (!pass.testWord(trypass)) {
			System.out.println("Wrong Password!");
		} else {
			System.out.println("Safe Activated");
		}
		active = pass.testWord(trypass);
	}

	public void deactivate() {
		this.active = false;
		this.close();
		System.out.println("Safe Deactivated");
	}

	public void open(String trypass) {
		if (!pass.testWord(trypass)) {
			System.out.println("Wrong Password!");
		}
		else {
			System.out.println("Safe Opened");
		}
		open = pass.testWord(trypass);
	}

	public void close() {
			open = false;
			System.out.println("Safe Closed");
		}
	
	public boolean getSafeStatus() {
		return this.active;
	}
}