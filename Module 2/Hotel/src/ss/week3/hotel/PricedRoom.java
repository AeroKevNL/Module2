package ss.week3.hotel;

public class PricedRoom extends Room {
	private int roomNumber;
	private double roomPrice;
	private Safe safe;
	
	public PricedRoom(int num, double roomprice, Safe safe){
		super(num, safe);
		this.roomNumber = num;
		this.roomPrice = roomprice;
		this.safe = safe;
	}
	
	public String toString(){
		return "Room Number: " + roomNumber + "| Room Price: " + roomPrice + " | Safe: " + safe;
	}
	
	public double getAmount(){
		return 73.42;
	}
} 
