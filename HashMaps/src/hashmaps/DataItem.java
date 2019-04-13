package hashmaps;

/**
 * @author Christina
 *
 */
public class DataItem {
	// Key and Data items
	private int key;
	private String email;
	private String name;
	
	// Constructor
	/**
	 * @param kk
	 * @param ee
	 * @param nn
	 */
	public DataItem(int kk, String ee, String nn) {
		key = kk;
		email = ee;
		name = nn;
	}

	// Getters and Setters
	/**
	 * @return
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataItem [key=" + key + ", email=" + email + ", name=" + name + "]";
	}
}
