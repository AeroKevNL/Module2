package ss.week2.test;

public class LampTest {
	
	public static void main(String[] args) {
		ThreeWayLamp lamp = new ThreeWayLamp(ThreeWayLamp.lampStateEnum.OFF);
		for(;;){
			System.out.println(lamp.getState());
			lamp.nextState();
		}
	}
}
