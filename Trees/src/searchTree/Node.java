package searchTree;

/**
 * @author Christina
 *
 */
public class Node {
	// Properties
	public int iData;
	public String sData;
	public Node leftChild;
	public Node rightChild;
    
    // Constructor
    public Node() 
    { 
        leftChild = rightChild = null; 
    }
	
	// Display Node
	/**
	 * @param iData
	 * @param sData
	 * @return
	 */
	public String displayNode(int iData, String sData) {
		String nodeInfo = "{" + iData + ", " + sData + "} ";
		return nodeInfo;
	}
}
