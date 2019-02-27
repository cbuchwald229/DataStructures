package queueStackLists;

public class QueueListDriver {
	public static void main(String[] args) {
		QueueLinkedList theQueue = new QueueLinkedList();
		
    	// Is empty, is full, size on list
    	boolean answer = theQueue.isEmpty();
    	System.out.println("Is it empty? " + answer);
    	boolean answer2 = theQueue.isFull();
    	System.out.println("Is it full? " + answer2);
    	int size = theQueue.getTheList().getSize();
    	System.out.println("Size: " + size);
		
    	// Add links
		try {
			theQueue.insert("Dog");
			System.out.println("Enqueue");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.insert("Cat");
			System.out.println("Enqueue");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Print
    	System.out.println("Queue Linked List: ");
    	Link current1 = theQueue.getTheList().getFirst();
    	while (current1 != null) {
    		System.out.println("-" + current1.getData().toString());
    		current1 = current1.next;
    	}
    	
    	// Add links
		try {
			theQueue.insert("Rabbit");
			System.out.println("Enqueue");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.insert("Duck");
			System.out.println("Enqueue");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.insert("Monkey");
			System.out.println("Enqueue");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Print
    	System.out.println("Queue Linked List: ");
    	Link current2 = theQueue.getTheList().getFirst();
    	while (current2 != null) {
    		System.out.println("-" + current2.getData().toString());
    		current2 = current2.next;
    	}
		
		// Remove off links
		try {
			theQueue.remove();
			System.out.println("Pop");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theQueue.remove();
			System.out.println("Pop");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Print
    	System.out.println("Queue Linked List: ");
    	Link current3 = theQueue.getTheList().getFirst();
    	while (current3 != null) {
    		System.out.println("-" + current3.getData().toString());
    		current3 = current3.next;
    	}
    	
    	// Is empty, is full, size on list
    	boolean answer3 = theQueue.isEmpty();
    	System.out.println("Is it empty? " + answer3);
    	boolean answer4 = theQueue.isFull();
    	System.out.println("Is it full? " + answer4);
    	int size2 = theQueue.getTheList().getSize();
    	System.out.println("Size: " + size2);
	}
}
