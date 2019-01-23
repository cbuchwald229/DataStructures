package gettingDressed;

/**
 * @author Christina
 *
 */
public class Pant extends Clothing {
	/**
	 * 
	 */
	//For how tall someone's legs are for pants
	private int length;
	
	/**
	 * @param size
	 * @param color
	 * @param length
	 */
	public Pant(String size, String color, int length) {
		super(size, color);	
		this.length = length;
	}
	
	/**
	 * 
	 */
	public Pant() {
		super();
	}
	
	/**
	 * @return
	 */
	// This method is to override the clothing wash method
	@Override
	public String wash() {
		return "Dry clean only.";
	}
	
	/**
	 * @return
	 */
	// New method
	public String hang() {
		return "Hang this up.";
	}
	
	/**
	 * @return
	 */
	// Declare the getters and setters
	public int getLength() {
		return length;
	}

	/**
	 * @param size
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// Add the length
	@Override
	public String toString() {
		return (super.toString()+ ", length=" + length);
	}
}
