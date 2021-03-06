package ss.week3.hotel;


/**
 * Hotel guest with a name and possibly a hotel room.
 * 
 * @author Wij
 * @version $Revision: 0.0.8b $
 */
public class Guest {

	String guestName;
	Room roomNumber;

	/**
	 * Creates a <code>Guest</code> without a room.
	 * 
	 * @param n
	 *            Name of the Guest
	 */
	public Guest(java.lang.String n) { 
		this.guestName = n;
	}

	/**
	 * Checks a <code>Guest</code> into a <code>Room</code>.
	 * 
	 * @param r
	 *            Number of the <code>Room</code>.
	 * @return true if the <code>Guest</code> has been checked in, false if the
	 *         <code>Guest</code> already has a <code>Room</code>, or that
	 *         <code>Room</code> is already taken.
	 */
	public boolean checkin(ss.week3.hotel.Room r) {
		if (roomNumber == null && r.getGuest() == null) {
			roomNumber = r;
			System.out.println(roomNumber);
			r.setGuest(this,null);
			return true;
		} 
		else
			return false;
	}

	/**
	 * Checks a <code>Guest</code> out of a <code>Room</code>
	 * 
	 * @return true if the <code>Guest</code> has been checked out, false if the
	 *         <code>Guest</code> doesn't have a <code>Room</code>.
	 */
	public boolean checkout() {
		if (roomNumber == null) {
			return false;
		} else {
			roomNumber.setGuest(null,Password.INITIAL);
			roomNumber = null;
			return true;
		}
	}

	/**
	 * Gets the name of the <code>Guest</code>.
	 * 
	 * @return the name of a <code>Guest</code>
	 */
	public String getName() {
		return guestName;
	}

	/**
	 * Gets the <code>Room</code> of the <code>Guest</code>.
	 * 
	 * @return the <code>Room</code> of a <code>Guest</code>
	 */
	public Room getRoom() {
		return roomNumber;
	}

	public String toString() {
		return getName();
	}
}
