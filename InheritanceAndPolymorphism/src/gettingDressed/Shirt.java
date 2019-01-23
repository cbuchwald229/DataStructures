package gettingDressed;

/**
 * @author Christina
 *
 */
public class Shirt extends Clothing {
	/**
	 * 
	 */
	// For how long the sleeves are on the shirt
	private String sleeve;
	private String size;
	
	/**
	 * @param size
	 * @param color
	 * @param sleeve
	 * @throws Exception 
	 */
	public Shirt(String size, String color, String sleeve) throws Exception {
		super();	
		try {
			setSleeve(sleeve);
			setSize(size);
		} catch (Exception e) {
			throw new Exception("Shirt not created!"); // I couldn't get this to throw...
		}
	}
	
	/**
	 * 
	 */
	public Shirt() {
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
	public String hang() {
		return "Hang this up.";
	}
	
	/**
	 * @return
	 */
	// Declare getters and setters
	public String getSleeve() {
		return sleeve;
	}

	/**
	 * @param size
	 */
	// Restrict sleeve
	public void setSleeve(String sleeve) throws Exception {
		if (!sleeve.equalsIgnoreCase("short") && !sleeve.equalsIgnoreCase("long") && !sleeve.equalsIgnoreCase("none")) {
			throw new Exception("Shirt sleeve not short, long, or none.");
		}
		this.sleeve = sleeve;
	}
	
	/**
	 * @return
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(String size) throws Exception {
		// Restrict size
		if (!size.equalsIgnoreCase("S") && !size.equalsIgnoreCase("M") && !size.equalsIgnoreCase("L")) {
			throw new Exception("Shirt size not S, M, or L.");
		}
		this.size = size;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// Add the sleeve
	@Override
	public String toString() {
		return (super.toString()+ ", sleeve=" + sleeve);
	}
}