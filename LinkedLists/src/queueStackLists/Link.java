package queueStackLists;

/**
 * @author Christina
 *
 */
public class Link {
	public String data;
	public Link next;
	
	// Constructor
	/**
	 * @param d
	 */
	public Link(String d) {
		data = d;
	}
	
	// Getters and Setters
	/**
	 * @return
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * @return
	 */
	public Link getNext() {
		return next;
	}
	
	/**
	 * @param next
	 */
	public void setNext(Link next) {
		this.next = next;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// To String
	@Override
	public String toString() {
		return "Link [data=" + data + ", next=" + next + "]";
	}
}
