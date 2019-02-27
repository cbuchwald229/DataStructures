package queueStackLists;

/**
 * @author Christina
 *
 */
public class StackLinkedList {
	private LinkList theList;
	
	/**
	 * 
	 */
	public StackLinkedList() {
		theList = new LinkList();
	}
	
	/**
	 * @param d
	 * @throws Exception 
	 */
	public void push(String d) throws Exception {
		theList.insertFirst(d);
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	public String pop() throws Exception {
		return theList.deleteFirst();
	}
	
	/**
	 * @return
	 */
	public boolean isEmpty() {
		return (theList.isEmpty());
	}
	
	/**
	 * @return
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * @return
	 */
	public LinkList getTheList() {
		return theList;
	}

	/**
	 * @param theList
	 */
	public void setTheList(LinkList theList) {
		this.theList = theList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StackLinkedList [theList=" + theList + "]";
	}
}
