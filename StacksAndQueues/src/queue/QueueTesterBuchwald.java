package queue;

import java.util.Scanner;

/**
 * @author Christina
 *
 */
public class QueueTesterBuchwald {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate the stack and it's size
		int queueSize = 5;
		Queue theQueue = new Queue(queueSize);
		
		//This is a queue. We add and subtract from the queue and print the results intermittently
		theQueue.print();
		try {
			theQueue.enqueue("dog");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.enqueue("cat");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.enqueue("mouse");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		theQueue.print();
		try {
			theQueue.enqueue("pig");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.enqueue("bird");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		theQueue.size();
		try {
			theQueue.enqueue("puppy");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		theQueue.size();
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		theQueue.print();
		theQueue.size();
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.enqueue("duck");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		theQueue.print();
		theQueue.peek();
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		theQueue.size();
		theQueue.isEmpty();
		theQueue.print();
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.dequeue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
// Again, I feel like it's not the most elegant, but it works.
