package ss.week1;

public class ThreeWayLamp {
	private int lampState;
	
	public ThreeWayLamp(int state) {
		this.lampState = state;
	} 
	
	public int getState() { 
		return lampState;
	}
	
	public void setState(int state) {
		lampState = state;
	}
	
	public void nextState() {
		if(lampState == 3) {
			lampState = 0;
		}
		else {
			lampState++;
		}
	}
}



