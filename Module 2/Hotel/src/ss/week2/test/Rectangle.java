package ss.week2.test;

public class Rectangle {
	
	/*@ public invariant length() >= 0;
		public invariant width() >= 0;*/
	
	private int lengthRectangle;
	private int widthRectangle;
	
	//@ requires length >= 0 && width >= 0;
	public Rectangle (int length, int width) {
		this.lengthRectangle = length;
		this.widthRectangle = width;
	}
	
	/*@ pure */ public int length() {
		return lengthRectangle;
	}
	
	/*@ pure */ public int width() {
		return widthRectangle;
	}

	//@ ensures area() >= 0;
	/*@ pure */ public int area() {
		return length() * width();
	}
	
	//@ ensures perimeter() >= 0;
	/*@ pure */ public int perimeter() {
		return length() * 2 + width() * 2; 
	}
}
