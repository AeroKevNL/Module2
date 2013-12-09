package ss.week2.test;

public class ThreeWayLamp {
	
	public enum lampStateEnum {OFF,LOW,MED,HIG,MED2,LOW2};
	
	lampStateEnum lampState;
	
	public ThreeWayLamp(lampStateEnum state) {
		this.lampState = state;
	}
	
	public String getState() { 
		switch(lampState){
			case OFF:  return "Off";
			case LOW:  return "Low";
			case MED:  return "Medium";
			case HIG:  return "High";
			case MED2: return "Medium";
			case LOW2: return "Low";
			default:   return "Off";
		} 
	}
	
	public void nextState() {
		switch(lampState){
			case LOW2: lampState = lampStateEnum.OFF; break;
			case MED2: lampState = lampStateEnum.LOW2; break;
			case HIG:  lampState = lampStateEnum.MED2; break;
			case MED:  lampState = lampStateEnum.HIG; break;
			case LOW:  lampState = lampStateEnum.MED; break;
			case OFF:  lampState = lampStateEnum.LOW; break;
			default:   lampState = lampStateEnum.OFF; break;
		} 
	}
}



