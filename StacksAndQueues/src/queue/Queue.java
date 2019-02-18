package queue;

import java.util.Arrays;

/**
 * @author Christina
 *
 */
public class Queue {
	// Properties
	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	// Constructor
	/**
	 * @param s
	 */
	public Queue(int s) {
		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
		for (int i = 0; i < maxSize; i++) {
			queArray[i]="";
		}
	}
	
	// Methods
	// Put item at rear of queue
	/**
	 * @param j
	 * @return
	 * @throws Exception
	 */
	public String enqueue(String j) throws Exception {
		if (nItems==(maxSize)) {
			throw new Exception("This queue is full.");
		} else {
			// To deal with wraparound
			if (rear == maxSize-1) { 
				rear = -1;
			}
			queArray[++rear] = j;
			nItems++;
			return j;
		}
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	// Take item from front of queue
	public String dequeue() throws Exception {
		if (nItems==0) {
			throw new Exception("This queue is empty.");
		} else {
			String temp = queArray[front++];
			// To deal with wraparound
			queArray[front-1] = "";
			nItems--;
			if(front == maxSize) {
				front = 0;
			}
			return temp;
		}
	}
	
	/**
	 * 
	 */
	// Peek at front of queue
	public String peek() {
		return queArray[front];
	}
	
	/**
	 * @return
	 */
	// True if queue is empty
	public boolean isEmpty() {
		return (nItems==0);
	}
	
	/**
	 * @return
	 */
	// True if queue is full
	public boolean isFull() {
		return (nItems==maxSize);
	}
	
	/**
	 * 
	 */
	// Number of items in queue
	public int size() {
		int value = nItems;
		return value;
	}
	
	/**
	 * 
	 */
	// Take a look at the queue
	public String print() {
		/*System.out.println("Print:");
		for (int i = 0; i < maxSize; i++) {
			System.out.println("-" + queArray[i] + " ");
		}*/
		return toString();
	}

	// Getter and Setter like Stack class
	/**
	 * @return
	 */
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * @param maxSize
	 */
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Queue " + Arrays.toString(queArray);
	}
	
	
}
