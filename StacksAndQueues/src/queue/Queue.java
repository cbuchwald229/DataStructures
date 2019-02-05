package queue;

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
	/**
	 * @param j
	 * @throws Exception 
	 */
	// Put item at rear of queue
	public void enqueue(String j) throws Exception {
		System.out.println("Enqueue");
		if (nItems==(maxSize)) {
			throw new Exception("This queue is full.");
		} else {
			// To deal with wraparound
			if (rear == maxSize-1) { 
				rear = -1;
			}
			queArray[++rear] = j;
			nItems++;
		}
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	// Take item from front of queue
	public String dequeue() throws Exception {
		System.out.println("Dequeue");
		if (nItems==0) {
			throw new Exception("This queue is empty.");
		} else {
			String temp = queArray[front++];
			// To deal with wraparound
			if(front == maxSize) {
				front = 0;
			}
			queArray[front-1] = "";
			nItems--;
			return temp;
		}
	}
	
	/**
	 * 
	 */
	// Peek at front of queue
	public void peek() {
		System.out.println(queArray[front]);
	}
	
	/**
	 * @return
	 */
	// True if queue is empty
	public boolean isEmpty() {
		if (nItems == 0) {
			System.out.println("Stack is empty.");
		} else {
			System.out.println("Stack is not empty.");
		}
		return (nItems==0);
	}
	
	/**
	 * @return
	 */
	// True if queue is full
	public boolean isFull() {
		if (nItems == maxSize) {
			System.out.println("Stack is full.");
		} else {
			System.out.println("Stack is not full.");
		}
		return (nItems==maxSize);
	}
	
	/**
	 * 
	 */
	// Number of items in queue
	public void size() {
		int value = nItems;
		System.out.println("The queue size is: " + value);
	}
	
	/**
	 * 
	 */
	public void print() {
		System.out.println("Print:");
		for (int i = 0; i < maxSize; i++) {
			System.out.println("-" + queArray[i] + " ");
		}
	}
}
