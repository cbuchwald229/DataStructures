package queue;

import java.util.Scanner;

public class QueueTesterBuchwald {
	public static void main(String[] args) {
		// Instantiate the stack and it's size
		int queueSize = 5;
		Queue theQueue = new Queue(queueSize);
		
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
	}
}
