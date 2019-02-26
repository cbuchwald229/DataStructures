package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class LinkedListDriverBuchwald {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
    	// Create linked list
    	LinkedList sortedList  = new LinkedList();
    	
    	// Create cans
    	CanBuchwald DelMontePeaches = new CanBuchwald("Del Monte", "Peaches", 29.0, 2.22);
    	CanBuchwald LibbysPumpkin = new CanBuchwald("Libbys", "Pumpkin", 15.0, 2.19);
    	CanBuchwald DelMonteGreenBeans = new CanBuchwald("Del Monte", "Green Beans", 14.5, 0.99);
    	CanBuchwald DelMonteCreamedCorn = new CanBuchwald("Del Monte", "Creamed Corn", 14.75, 0.99);
    	CanBuchwald MyBrandCarrots = new CanBuchwald("My Brand", "Carrots", 4.50, 10.00);
    	
    	// Is empty, is full, size
    	System.out.println("Is list empty? " + sortedList.isEmpty());
    	System.out.println("Is list full? " + sortedList.isFull());
    	System.out.println("Size: " + sortedList.getSize());
    	
    	// Insert cans
    	try {
			sortedList.insert(DelMontePeaches);
			System.out.println("Added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	try {
			sortedList.insert(LibbysPumpkin);
			System.out.println("Added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	// Display List
    	System.out.println("Sorted Linked List: ");
    	Link current = sortedList.getFirst();
    	while (current != null) {
    		System.out.println(current.getData().toString());
    		current = current.next;
    	}
    	
    	// Is empty, is full, size
    	System.out.println("Is list empty? " + sortedList.isEmpty());
    	System.out.println("Is list full? " + sortedList.isFull());
    	System.out.println("Size: " + sortedList.getSize());
    	
    	// Insert more cans
    	try {
			sortedList.insert(DelMonteGreenBeans);
			System.out.println("Added");
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
    	try {
			sortedList.insert(DelMonteCreamedCorn);
			System.out.println("Added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	try {
			sortedList.insert(MyBrandCarrots);
			System.out.println("Added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	// Display List
    	System.out.println("Sorted Linked List: ");
    	Link current2 = sortedList.getFirst();
    	while (current2 != null) {
    		System.out.println(current2.getData().toString());
    		current2 = current2.next;
    	}
    	
    	// Remove an item
    	try {
			sortedList.delete();
			System.out.println("Deleted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	// Display List
    	System.out.println("Sorted Linked List: ");
    	Link current3 = sortedList.getFirst();
    	while (current3 != null) {
    		System.out.println(current3.getData().toString());
    		current3 = current3.next;
    	}
    	
    	// Is empty, is full, size
    	System.out.println("Is list empty? " + sortedList.isEmpty());
    	System.out.println("Is list full? " + sortedList.isFull());
    	System.out.println("Size: " + sortedList.getSize());
    }
}
// This one went much better!