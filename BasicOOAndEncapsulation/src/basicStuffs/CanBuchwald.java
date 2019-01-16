package basicStuffs;

/**
 * @author Christina
 *
 */
public class CanBuchwald {
	private String company;
	private String contents;
	private double size;
	private double price;

	/**
	 * @param company
	 * @param contents
	 * @param size
	 * @param price
	 */
	public CanBuchwald(String company, String contents, double size, double price) {
		super();
		this.company = company;
		this.contents = contents;
		this.size = size;
		this.price = price;
	}
	
	/**
	 * 
	 */
	public CanBuchwald() {
		super();
	}
	
	/**
	 * @return
	 */
	public String getCompany() {
		return company;
	}
	
	/**
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	/**
	 * @return
	 */
	public String getContents() {
		return contents;
	}
	
	/**
	 * @param contents
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	/**
	 * @return
	 */
	public double getSize() {
		return size;
	}
	
	/**
	 * @param size
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CanBuchwald [company = " + company + ", contents = " + contents + ", size = " + size + ", price = " + price
				+ "]";
	}
}
