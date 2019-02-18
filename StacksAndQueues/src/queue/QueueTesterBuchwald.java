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
		
		// Print the empty queue
		String queuePrint1 = theQueue.print();
		System.out.println(queuePrint1);
		
		// Enqueue dog, cat, and mouse and reprint
		try {
			String animal = theQueue.enqueue("dog");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.enqueue("cat");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.enqueue("mouse");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String queuePrint2 = theQueue.print();
		System.out.println(queuePrint2);
		
		// Enqueue pig and bird and then show queue size
		try {
			String animal = theQueue.enqueue("pig");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.enqueue("bird");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int currSize1 = theQueue.size();
		System.out.println("The queue size is: " + currSize1);
		
		// Try to enqueue to a full queue and show size stays the same
		try {
			String animal = theQueue.enqueue("puppy");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int currSize2 = theQueue.size();
		System.out.println("The queue size is: " + currSize2);
		
		// Dequeue dog and cat and reprint and show size
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String queuePrint3 = theQueue.print();
		System.out.println(queuePrint3);
		int currSize3 = theQueue.size();
		System.out.println("The queue size is: " + currSize3);
		
		// Dequeue mouse and enqueue duck and print
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.enqueue("duck");
			System.out.println("Enqueue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String queuePrint4 = theQueue.print();
		System.out.println(queuePrint4);
		
		// Peek at the front of the queue
		String topAnimal = theQueue.peek();
		System.out.println("Front of queue: " + topAnimal);
		
		//Dequeue pig and bird and print size, ask if it's empty, and reprint queue
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int currSize4 = theQueue.size();
		System.out.println("The queue size is: " + currSize4);
		boolean result = theQueue.isEmpty();
		if(theQueue.isEmpty()) {
			System.out.println("The queue is empty.");
		} else {
			System.out.println("The queue is not empty.");
		}
		String queuePrint5 = theQueue.print();
		System.out.println(queuePrint5);
		
		// Dequeue duck and try to dequeue an empty queue
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String animal = theQueue.dequeue();
			System.out.println("Dequeue " + animal);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
// I added a few extra steps for testing and left them in.