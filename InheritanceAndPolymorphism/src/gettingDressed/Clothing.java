package gettingDressed;

/**
 * @author Christina
 *
 */
public class Clothing {
	private String size;
	private String color;
	
	/**
	 * 
	 */
	public Clothing() {
		super();
	}
	
	/**
	 * @param size
	 * @param color
	 */
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
	public String getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(String size) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "clothing [size=" + size + ", color=" + color + "]";
	}
}
