package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class Link {
	public CanBuchwald data;
	public Link next;
	
    /**
     * @param d
     */
    public Link(CanBuchwald d) {
        data = d;
    }

	/**
	 * @return
	 */
	public CanBuchwald getData() {
		return data;
	}

	/**
	 * @param data
	 */
	public void setData(CanBuchwald data) {
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
	@Override
	public String toString() {
		return "Link [data=" + data + ", next=" + next + "]";
	}
}
