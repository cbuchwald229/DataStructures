package queueStackLists;

public class StackListDriver {
	public static void main(String[] args) {
		StackLinkedList theStack = new StackLinkedList();
		
    	// Is empty, is full, size on list
    	boolean answer = theStack.isEmpty();
    	System.out.println("Is it empty? " + answer);
    	boolean answer2 = theStack.isFull();
    	System.out.println("Is it full? " + answer2);
    	int size = theStack.getTheList().getSize();
    	System.out.println("Size: " + size);
		
		// Add links
		try {
			theStack.push("Dog");
			System.out.println("Push");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theStack.push("Cat");
			System.out.println("Push");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Print
    	System.out.println("Stack Linked List: ");
    	Link current1 = theStack.getTheList().getFirst();
    	while (current1 != null) {
    		System.out.println("-" + current1.getData().toString());
    		current1 = current1.next;
    	}
		
		// Add links
		try {
			theStack.push("Rabbit");
			System.out.println("Push");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theStack.push("Duck");
			System.out.println("Push");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theStack.push("Monkey");
			System.out.println("Push");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Print
    	System.out.println("Stack Linked List: ");
    	Link current2 = theStack.getTheList().getFirst();
    	while (current2 != null) {
    		System.out.println("-" + current2.getData().toString());
    		current2 = current2.next;
    	}
		
		// Pop off links
		try {
			theStack.pop();
			System.out.println("Pop");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			theStack.pop();
			System.out.println("Pop");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Print
    	System.out.println("Stack Linked List: ");
    	Link current3 = theStack.getTheList().getFirst();
    	while (current3 != null) {
    		System.out.println("-" + current3.getData().toString());
    		current3 = current3.next;
    	}
    	
    	// Is empty, is full, size on list
    	boolean answer3 = theStack.isEmpty();
    	System.out.println("Is it empty? " + answer3);
    	boolean answer4 = theStack.isFull();
    	System.out.println("Is it full? " + answer4);
    	int size2 = theStack.getTheList().getSize();
    	System.out.println("Size: " + size2);
	}
}