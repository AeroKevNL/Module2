package ss.week1;

public class LampTest {
	
	public static void main(String[] args) {
		ThreeWayLamp lamp = new ThreeWayLamp(0);
		System.out.println(lamp.getState());
		lamp.setState(1);
		System.out.println(lamp.getState());
		lamp.setState(3);
		System.out.println(lamp.getState());
		lamp.nextState();
		System.out.println(lamp.getState());
		lamp.nextState();
		System.out.println(lamp.getState());
		lamp.nextState();
		System.out.println(lamp.getState());
		lamp.nextState();
		System.out.println(lamp.getState());
		lamp.nextState();
		System.out.println(lamp.getState());
	}
}
