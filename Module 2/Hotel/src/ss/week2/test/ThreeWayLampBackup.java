package ss.week2.test;

public class ThreeWayLampBackup {
	private int lampState;
	
	//@ public invariant getState() >= 0 && getState() <= 3;
	
	/*@ requires state >= 0 && state <= 3;
	 	ensures getState() == state;
		ensures getState() >= 0 && getState() <= 3; */
	public ThreeWayLampBackup(int state) {
		this.lampState = state;
	} 
	
	/*@ pure */ public int getState() { 
		return lampState;
	}
	
	/*@ requires state >= 0 && state <= 3;
		ensures getState() == state;
		ensures getState() >= 0 && getState() <= 3; */
	public void setState(int state) {
		lampState = state;	
	}
	
	//* ensures getState() >= 0 && getState() <= 3;
	public void nextState() {
		if(lampState == 3) lampState = 0;
		else lampState++;
	}
}
