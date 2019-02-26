package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class LinkedList {
	private Link first;
	private int size;
	
	/**
	 * 
	 */
	// Constructor
	public LinkedList() {
		first = null;
		size = 0;
	}
	
	//Methods
	/**
	 * @return
	 */
	public boolean isEmpty() {
		return (first==null);
	}
	
	/**
	 * @return
	 */
	public boolean isFull() {
		return false;
	}
	
	/**
	 * @param c
	 * @throws Exception 
	 */
	public void insert(CanBuchwald c) throws Exception {
		if (c != null) {
			Link newLink = new Link(c);
			Link previous = null;
			Link current = first;
			
			while (current != null && c.getContents().compareTo(current.getData().getContents()) > 0) {
				previous = current;
				current = current.next;
			}
			if (previous==null) {
				first = newLink;
			} else {
				previous.next = newLink;
			}
			newLink.next = current;
			size++;
		} else {
			throw new Exception("Can is invalid");
		}
	}
	
	/**
	 * @return
	 */
	// Since remove method was not specified, I'm doing a remove first method
	public Link delete() throws Exception {
		if (size != 0) {
			Link temp = first;
			first = first.next;
			size--;
			return temp;
		} else {
			throw new Exception("List is empty");
		}
	}

	/**
	 * @return
	 */
	public Link getFirst() {
		return first;
	}

	/**
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param first
	 */
	public void setFirst(Link first) {
		this.first = first;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LinkedList [first=" + first + ", size=" + size + "]";
	}
}
