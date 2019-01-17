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
	
	/**
	 * @param size
	 * @param color
	 * @param sleeve
	 */
	public Shirt(String size, String color, String sleeve) {
		super(size, color);	
		this.sleeve = sleeve;
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
	public String getSleeve() {
		return sleeve;
	}

	/**
	 * @param size
	 */
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return (super.toString()+ ", sleeve=" + sleeve + "]");
	}
}