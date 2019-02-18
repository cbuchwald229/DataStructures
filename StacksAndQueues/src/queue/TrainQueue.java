package queue;

/**
 * @author Christina
 *
 */
public class TrainQueue extends Queue {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	// Constructor
	/**
	 * @param size
	 */
	public TrainQueue(int size) {
		super(size);
		maxSize = size;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
		for (int i = 0; i < maxSize; i++) {
			queArray[i]=0;
		}
	}
	
	// Put item at rear of queue
	/**
	 * @param j
	 * @return
	 * @throws Exception
	 */
	public int enqueueCustomer(int j) throws Exception {
		if (nItems==(maxSize)) {
			throw new Exception("This queue is full.");
		} else {
			queArray[++rear] = j;
			nItems++;
			return j;
		}
	}
	
	// Take item from front of queue
	/* (non-Javadoc)
	 * @see queue.Queue#dequeue()
	 */
	public int dequeueCustomer() throws Exception {
		if (nItems==0) {
			throw new Exception("This queue is empty.");
		} else {
			int temp = queArray[front++];
			queArray[front-1] = 0;
			nItems--;
			return temp;
		}
	}

}
