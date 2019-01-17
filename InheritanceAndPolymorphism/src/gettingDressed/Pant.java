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
	@Override
	public String wash() {
		return "Dry clean only";
	}
	
	/**
	 * @return
	 */
	public String hang() {
		return "Hang this up.";
	}
	
	/**
	 * @return
	 */
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
	@Override
	public String toString() {
		return (super.toString()+ ", length=" + length + "]");
	}
}
