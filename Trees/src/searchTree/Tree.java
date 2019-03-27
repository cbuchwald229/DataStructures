package searchTree;

import java.util.*;

/**
 * @author Christina
 *
 */
public class Tree {
	// First node of tree
	/**
	 * 
	 */
	private Node root;
	
	// Constructor
	/**
	 * 
	 */
	public Tree() {
		root = null;
	}
	
	// Find node with given key
	/**
	 * @param key
	 * @return
	 */
	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	/**
	 * @param id
	 * @param dd
	 * @throws Exception
	 */
	public void insert(int id, String dd) throws Exception {
		if(id >= 0 && dd != null) {
			Node newNode = new Node();
			newNode.iData = id;
			newNode.sData = dd;
			if(root == null) {
				root = newNode;
			} else {
				Node current = root;
				Node parent;
				while(true) {
					parent = current;
					if(id < current.iData) {
						current = current.leftChild;
						if(current == null) {
							parent.leftChild = newNode;
							return;
						}
					} else {
						current = current.rightChild;
						if(current == null) {
							parent.rightChild = newNode;
							return;
						}
					}
				}
			}
		} else {
			throw new Exception("Please make sure node has positive int ID and name.");
		}
	}
	
	// Delete node with given key
	/**
	 * @param key
	 * @return
	 */
	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		// Find node
		while(current.iData != key) {
			parent = current;
			if(key < current.iData) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null) {
				return false;
			}
		}
		
		// No children
		if(current.leftChild == null && current.rightChild == null) {
			if(current == root) {
				root = null;
			} else if(isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}
		
		// If no right child, replace with left subtree
		else if(current.rightChild == null) {
			if(current == root) {
				root = current.leftChild;
			} else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		}
		
		// If no left child, replace with right subtree
		else if(current.leftChild == null) {
			if(current == root) {
				root = current.rightChild;
			} else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		}
		
		// Two children, so replace with inorder successor
		else {
			Node successor = getSuccessor(current);
			
			if(current == root) {
				root = successor;
			} else if(isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			
			// Connect successor to current's left child
			successor.leftChild = current.leftChild;
		}
		
		return true;
	}
	
	// Returns node with next highest value after delNode
	// Goes to right child, then right child's left descendants
	/**
	 * @param delNode
	 * @return
	 */
	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	/**
	 * @param traverseType
	 * @return
	 */
	public String traverse(int traverseType) {
		String result = "";
		switch(traverseType) {
		case 1: result = "\nPreorder traversal: " + preOrder(root) + "\n";
			break;
		case 2: result = "\nInorder traversal: " + inOrder(root) + "\n";
			break;
		case 3: result = "\nPostorder traversal: " + postOrder(root) + "\n"; 
			break;
		}
		return result;
	}
	
	/**
	 * @param localRoot
	 * @return
	 */
	public String preOrder(Node localRoot) {
		String result = "";
		if(localRoot != null) {
			result = result + localRoot.iData + " ";
			result = result + preOrder(localRoot.leftChild);
			result = result + preOrder(localRoot.rightChild);
			return result;
		} else {
			return "";
		}
	}
	
	/**
	 * @param localRoot
	 * @return
	 */
	public String inOrder(Node localRoot) {
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			String result = localRoot.iData + " ";
			inOrder(localRoot.rightChild);
			return result;
		} else {
			return "null";
		}
	}
	
	/**
	 * @param localRoot
	 * @return
	 */
	public String postOrder(Node localRoot) {
		if(localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			String result = localRoot.iData + " ";
			return result;
		} else {
			return "null";
		}
	}
	
	/**
	 * @return
	 */
	public String displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		String result = "..............................................\n";
		while(isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;
			
			for(int j = 0; j < nBlanks; j++) {
				result = result + " ";
			}
			
			while(globalStack.isEmpty() == false) {
				Node temp = (Node)globalStack.pop();
				if(temp != null) {
					result = result + temp.iData;
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if(temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					} 
				} else {
					result = result + "--";
					localStack.push(null);
					localStack.push(null);
				}
				for(int j = 0; j < nBlanks*2-2; j++) {
					result = result + " ";
				}
			}
			result = result + "\n";
			
			nBlanks /= 2;
			while(localStack.isEmpty() == false) {
				globalStack.push(localStack.pop());
			}
		}
		result = result + "\n........................................................\n";
		return result;
	}
	
    /* Print nodes at the given level */
    /**
     * @param root
     * @param level
     * @return
     */
    public String printGivenLevel (Node root ,int level) 
    { 
    	String stringData = "";
        if (root == null) {
            return ""; 
        }
        if (level == 1) { 
        	stringData = stringData + root.iData + " ";
        } else if (level > 1) { 
        	stringData = stringData + printGivenLevel(root.leftChild, level-1); 
        	stringData = stringData + printGivenLevel(root.rightChild, level-1); 
        } 
        return stringData;
    }
    
    // Compute the "height" of a tree
    /**
     * @param root
     * @return
     */
    public int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.leftChild); 
            int rheight = height(root.rightChild); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
    
	/**
	 * @return
	 */
	String bfs = "";
	public String displayBfs() { 
        int h = height(root); 
        int i; 
        for (i = 1; i <= h; i++) {
            bfs = bfs + printGivenLevel(root, i); 
        }
        return bfs;
	}
}
