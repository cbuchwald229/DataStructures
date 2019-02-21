package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class Link {
	public CanBuchwald data;
	public int link;
	public Link next;
	
    /**
     * @param d
     */
    public Link(CanBuchwald d) {
        data = d;
        link = -1;
    }
	
    /**
     * @param d
     * @param l
     */
    public Link(CanBuchwald d, int l) {
        data = d;
        link = l;
    }
    
    /**
     * @return
     */
    public CanBuchwald getData() {
        return data;
    }

    /**
     * @param d
     */
    public void setData(CanBuchwald d) {
    	data = d;
    }

    /**
     * @return
     */
    public int getLink() {
        return link;
    }

    /**
     * @param l
     */
    public void setLink(int l) {
        link = l;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Link [data=" + data + ", link=" + link + "]";
	}
}
