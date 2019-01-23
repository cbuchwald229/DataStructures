package gettingDressed;

/**
 * @author Christina
 *
 */
public class Clothing {
	// Setting what all clothing objects should have
	private String size;
	private String color;
	
	/**
	 * 
	 */
	// Default Constructor
	public Clothing() {
		super();
	}
	
	/**
	 * @param size
	 * @param color
	 */
	// Constructor with parameters
	public Clothing(String size, String color) {
		super();
		this.size = size;
		this.color = color;
	}
	
	/**
	 * @return
	 */
	public String wash() {
		return "Wash as directed on tag.";
	}
	
	/**
	 * @return
	 */
	public String pack() {
		return "Fold and pack.";
	}

	/**
	 * @return
	 */
	// Declaring the getters and setters
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(String size) throws Exception {
		this.size = size;
	}

	/**
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	// Clothing to string
	@Override
	public String toString() {
		return "Clothing - size=" + size + ", color=" + color + ", instructions=" + wash() + " " + pack();
	}
}
