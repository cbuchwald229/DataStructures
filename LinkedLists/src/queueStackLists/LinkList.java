package queueStackLists;

/**
 * @author Christina
 *
 */
public class LinkList {
	private Link first;
	private int size;

	/**
	 * 
	 */
	// Constructor
	public LinkList() {
		first = null;
	}
	
	/**
	 * @return
	 */
	// Asks if the stack is empty
	public boolean isEmpty() {
		return (first == null);
	}
	
	/**
	 * @return
	 */
	// Asks if stack is full
	public boolean isFull() {
		return false;
	}
	
	/**
	 * @param dd
	 * @throws Exception 
	 */
	// Inserts link at the top
	public void insertFirst(String dd) throws Exception {
		if (dd != null) {
		Link newLink = new Link(dd);
		newLink.next = first;
		first = newLink;
		size++;
		} else {
			throw new Exception("Link is not valid.");
		}
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	// Deletes link from the top
	public String deleteFirst() throws Exception {
		if (size!=0) {
			Link temp = first;
			first = first.next;
			size--;
			return temp.data;
		} else {
			throw new Exception("The stack is empty.");
		}
	}

	// Getter and setter
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
		return "LinkList [first=" + first + ", size=" + size + "]";
	}
}