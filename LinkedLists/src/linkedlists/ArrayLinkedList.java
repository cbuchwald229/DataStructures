package linkedlists;

import java.util.Arrays;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class ArrayLinkedList {

    private int maximum;
    private Node[] list;
    private int size;
    private int startOfListIndex = 0;

    /**
     * @param m
     */
    public ArrayLinkedList(int m) {
    	maximum = m;
        list = new Node[m];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Node(null);
        }
        size = 0;
    }

    /**
     * @param s
     * @throws Exception
     */
    public void insertLink(CanBuchwald s) throws Exception {
        if (this.getSize() == 0) {
        	Node a = new Node(s, -1);
            list[0] = a;
        } else if (size == maximum) {
            throw new Exception("List is full");
        } else {
            int index = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i].getData() == null) {
                    index = i;
                    break;
                }
            }
            Node b = new Node(s);
            list[index] = b;
            if (this.getSize() == 1) {
                if (list[index].getData().getContents().compareTo(list[0].getData().getContents()) < 0) {
                    list[index].setLink(0);
                    list[0].setLink(-1);
                    startOfListIndex = index;
                } else {
                    list[index].setLink(-1);
                    list[0].setLink(index);
                }
            } else {
                int i = startOfListIndex;
                int prevIndex = -1;
                while (i!=-1 && list[i].getData() != null) {
                    if (list[index].getData().getContents().compareTo(list[i].getData().getContents()) < 0) {
                        list[index].setLink(i);
                        if(prevIndex!=-1)
                            list[prevIndex].setLink(index);
                        else
                            startOfListIndex = index;
                        break;
                    }else{
                        prevIndex = i;
                        i=list[i].getLink();
                    }
                }
                if(i==-1)
                {
                    list[prevIndex].setLink(index);
                }
            }
        }
        size++;
    }
    
    /**
     * @param s
     * @throws Exception
     */
    public void deleteLink(CanBuchwald s) throws Exception {
        if (this.getSize() == 0) {
            throw new Exception("List is empty");
        }else{
            int firstEmpty = 0;
            for(int i = 0; i< list.length; i++){
                if(list[i].getData() == null){
                    firstEmpty = i;
                    break;
                }
            }
            int elementIndex = 0;
            int prev = -1;
            int next=-1;
            for(int i = 0; i < list.length; i++){
                if(list[i].getData().getContents().compareTo(s.getContents()) == 0){
                	elementIndex = i;
                    next = list[i].getLink(); 
                    for(int j = 0; j < list.length; j++){
                        if(list[j].getLink() == elementIndex){
                            prev = j;
                            break;
                        }
                    }
                    list[elementIndex].setDataNull();
                    list[elementIndex].setLink(firstEmpty);
                    if(next != -1) {
                        list[prev].setLink(next);
                    } else {
                        list[prev].setLink(-1);
                    }
                    size--;
                }else{
                	elementIndex++;
                }
            }
        }
    }
    
	/**
	 * @return
	 */
	// True if list is empty
	public boolean isEmpty(int s) {
		return (s==0);
	}
	
	/**
	 * @return
	 */
	// Never true
	public boolean isFull(int s, int m) {
		return (s==m);
	}
	
	/**
	 * 
	 */
	// Number of items in list
	public int size() {
		int value = size;
		return value;
	}

	/**
	 * @return
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param m
	 */
	public void setMaximum(int m) {
		maximum = m;
	}

	/**
	 * @return
	 */
	public Node[] getList() {
		return list;
	}

	/**
	 * @param list
	 */
	public void setList(Node[] list) {
		this.list = list;
	}

	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(int s) {
		this.size = s;
	}

	/**
	 * @return
	 */
	public int getStartOfListIndex() {
		return startOfListIndex;
	}

	/**
	 * @param startOfListIndex
	 */
	public void setStartOfListIndex(int startOfListIndex) {
		this.startOfListIndex = startOfListIndex;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LinkedList [MAXIMUM=" + maximum + ", list=" + Arrays.toString(list) + ", size=" + size
				+ ", startOfListIndex=" + startOfListIndex + "]";
	}
}