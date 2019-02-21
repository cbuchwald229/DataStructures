package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class Node {
    private CanBuchwald data;
    private int link;

    /**
     * @param d
     */
    public Node(CanBuchwald d) {
        data = d;
        link = -1;
    }

    /**
     * @param d
     * @param l
     */
    public Node(CanBuchwald d, int l) {
        data = d;
        link = l;
    }
    
    /**
     * 
     */
    public void setDataNull(){
        this.data = null;
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
    public CanBuchwald getData() {
        return data;
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
}
