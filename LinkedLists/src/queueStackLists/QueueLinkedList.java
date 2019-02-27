package queueStackLists;

/**
 * @author Christina
 *
 */
public class QueueLinkedList {
	private FirstLastList theList;
	
	/**
	 * 
	 */
	// Constructor
	public QueueLinkedList() {
		theList = new FirstLastList();
	}
	
	/**
	 * @return
	 */
	// Ask if its empty
	public boolean isEmpty() {
		return (theList.isEmpty());
	}
	
	/**
	 * @return
	 */
	// Ask if it's full
	public boolean isFull() {
		return false;
	}
	
	/**
	 * @param d
	 * @throws Exception
	 */
	// Insert a link
	public void insert(String d) throws Exception {
		theList.insertLast(d);
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	// Delete a link
	public String remove() throws Exception {
		return theList.deleteFirst();
	}

	// Getters and Setters
	/**
	 * @return
	 */
	public FirstLastList getTheList() {
		return theList;
	}

	/**
	 * @param theList
	 */
	public void setTheList(FirstLastList theList) {
		this.theList = theList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// To String
	@Override
	public String toString() {
		return "QueueLinkedList [theList=" + theList + "]";
	}
}
