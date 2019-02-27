package queueStackLists;

/**
 * @author Christina
 *
 */
public class FirstLastList {
	private Link first;
	private Link last;
	private int size;

	/**
	 * 
	 */
	// Constructor
	public FirstLastList() {
		first = null;
		last = null;
	}
	
	/**
	 * @return
	 */
	// Asks if its empty
	public boolean isEmpty() {
		return (first==null);
	}
	
	/**
	 * @return
	 */
	// Asks if its full
	public boolean isFull() {
		return false;
	}
	
	/**
	 * @param d
	 * @throws Exception 
	 */
	// Insert Link
	public void insertLast(String d) throws Exception {
		if (d != null) {
			Link newLink = new Link(d);
			if (isEmpty()) {
				first = newLink;
			} else {
				last.next = newLink;
			}
			last = newLink;
			size++;
		} else {
			throw new Exception("Link is not valid.");
		}
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	// Delete link
	public String deleteFirst() throws Exception {
		if(size!=0) {
			String temp = first.data;
			if (first.next == null) {
				last = null;
			}
			first = first.next;
			size--;
			return temp;
		} else {
			throw new Exception("List is empty.");
		}
	}

	// Getters and Setters
	/**
	 * @return
	 */
	public Link getFirst() {
		return first;
	}

	/**
	 * @param first
	 */
	public void setFirst(Link first) {
		this.first = first;
	}

	/**
	 * @return
	 */
	public Link getLast() {
		return last;
	}

	/**
	 * @param last
	 */
	public void setLast(Link last) {
		this.last = last;
	}
	
	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// To String
	@Override
	public String toString() {
		return "FirstLastList [first=" + first + ", last=" + last + ", size=" + size + "]";
	}
}
