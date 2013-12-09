package ss.week3.hotel;

public class Hotel {

	private String hotelName;
	private Password hotelPass;
	private Password pass;
	private Room room12;
	private Room room13;
	private Safe safe12;
	private Safe safe13;

	public Hotel(String hotelName) {
		this.hotelName = hotelName;
		safe12 = new Safe("Password123");
		room12 = new Room(12, safe12);
		safe13 = new Safe("Password123");
		room13 = new Room(13, safe13);
		pass = new Password();
		hotelPass = new Password();
	}

	public Room checkIn(String pass, Guest guest) {
		Room tempRoom = null;

		if (this.pass.testWord(pass) == false) {
			return tempRoom;
		}

		else if (room12.getGuest() == null && room12.getGuest() != guest && room13.getGuest() != guest) {
			room12.setGuest(guest, pass);
			hotelPass.setWord(Password.INITIAL, pass);
			tempRoom = room12;
		} 
		else if (room13.getGuest() == null && room13.getGuest() != guest && room12.getGuest() != guest) {
			room13.setGuest(guest, pass);
			hotelPass.setWord(Password.INITIAL, pass);
			tempRoom = room13;
		}
		return tempRoom;
	}

	public boolean checkOut(Guest guest) {
		if (getRoom(guest) != null && guest.getName() != null) {
			if (getRoom(guest).getSafe() != null) {
				getRoom(guest).getSafe().deactivate();
			}
			hotelPass = null;
			getRoom(guest).checkOut();
			return true;
		} 
		else return false;
	}

	public Room getFreeRoom() {

		if (room12.getGuest() == null) {
			System.out
					.println("We reserved room 12 for you. Please enjoy your stay.");
			return room12;
		} 
		else if (room13.getGuest() == null) {
			System.out
					.println("We reserved room 13 for you. Please enjoy your stay.");
			return room13;
		} 
		else {
			System.out.println("We apologize, there is no room available.");
			return null;
		}

	}

	public Room getRoom(Guest guest) {
		if (room12.getGuest() == guest) {
			return room12;
		} 
		else if (room13.getGuest() == guest) {
			return room13;
		} 
		else {
			System.out.println("This guest has no room in our hotel.");
			return null;
		}
	}

	public Password getPassword() {
		return hotelPass;
	}

	public String toString() {
		String room12String = "Room: Room12" + "Guest: " + room12.getGuest()
				+ "Safe status: " + room12.getPass();
		String room13String = "Room: Room13" + "Guest: " + room13.getGuest()
				+ "Safe status: " + room13.getPass();

		return room12String + "/n" + room13String;
	}

}
