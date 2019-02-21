package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class LinkedList {
	private Link first;
	
	/**
	 * 
	 */
	public LinkedList() {
		first = null;
	}
	
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
	 * @param can
	 * @param link
	 */
	public void insertLink(CanBuchwald can, int link) {
		Link newLink = new Link(can, link);
		newLink.next = first;
		first = newLink;
	}
	
	/**
	 * @return
	 */
	public Link deleteLink() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	// This file is based on the insert and delete first linked list in the book
	// I still need to add the alphabetical order
	// My other file does alphabetical backwards and orphans records when deleting
	// Will submit and then resubmit when I fix it

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LinkedList [first=" + first + "]";
	}
}
