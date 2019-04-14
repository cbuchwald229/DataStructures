package dmv;

import java.util.*;

/**
 * @author Christina
 *
 */
public class PriorityQueue {
	private int size = 0;

	private  List<Person> firstPriority = new ArrayList<Person>();
	private  List<Person> secondPriority = new ArrayList<Person>();
	
	/**
	 * @param p
	 * @throws Exception
	 */
	public void enqueue(Person p) throws Exception {
		if(p == null) {
			throw new Exception("Please enter a real person.");
		} else {
			if(p.getPriority() == 1) {
				firstPriority.add(p);
			} else {
				secondPriority.add(p);
			}
			size++;
		}
	}
	
	/**
	 * @throws Exception
	 */
	public void dequeue() throws Exception {
		if(firstPriority == null && secondPriority == null) {
			throw new Exception("No people in queue.");
		} else {
			if(firstPriority != null) {
				firstPriority.remove(0);
			} else {
				secondPriority.remove(0);
			}
			size--;
		}
	}
	
	// Getters and Setters
	/**
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
