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
