package linkedlists;

import basicStuffs.CanBuchwald;

/**
 * @author Christina
 *
 */
public class ArrayLinkedListedDriverBuchwald {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
    	// Create linked list
    	int max = 5;
    	ArrayLinkedList myList  = new ArrayLinkedList(max);
    	
    	// Create cans
    	CanBuchwald DelMontePeaches = new CanBuchwald("Del Monte", "Peaches", 29.0, 2.22);
    	CanBuchwald LibbysPumpkin = new CanBuchwald("Libbys", "Pumpkin", 15.0, 2.19);
    	CanBuchwald DelMonteGreenBeans = new CanBuchwald("Del Monte", "Green Beans", 14.5, 0.99);
    	CanBuchwald DelMonteCreamedCorn = new CanBuchwald("Del Monte", "Creamed Corn", 14.75, 0.99);
    	CanBuchwald MyBrandCarrots = new CanBuchwald("My Brand", "Carrots", 4.50, 10.00);
    	
    	// Insert cans into linked list
		try {
			myList.insertLink(DelMontePeaches);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			myList.insertLink(LibbysPumpkin);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			myList.insertLink(DelMonteGreenBeans);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			myList.insertLink(DelMonteCreamedCorn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			myList.insertLink(MyBrandCarrots);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
		//Print out List
        int i = myList.getStartOfListIndex();
        System.out.println("Linked List: ");
        if(myList.getSize()!=0) {
	        while(myList.getList()[i].getLink()!=-1)
	        {
	            System.out.println("-" + myList.getList()[i].getData());
	            i = myList.getList()[i].getLink();
	        }
	        System.out.println("-" + myList.getList()[i].getData());
        }
        
        // Delete a valid can
        try {
			myList.deleteLink(DelMontePeaches);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
		//Print out List again
        int j = myList.getStartOfListIndex();
        System.out.println("Linked List: ");
        if(myList.getSize()!=0) {
	        while(myList.getList()[j].getLink()!=-1)
	        {
	            System.out.println("-" + myList.getList()[j].getData());
	            j = myList.getList()[j].getLink();
	        }
	        System.out.println("-" + myList.getList()[j].getData());
        }
        	
        // Ask if it's full and empty
        boolean answer = myList.isEmpty(myList.getSize());
        System.out.println("Is list empty? " + answer);
        boolean answer2 = myList.isFull(myList.getSize(), max);
        System.out.println("Is list full? " + answer2);
        
        // Get current size
        System.out.println("Size: " + myList.getSize());
        
        // Well, I got the program to work. The problem now is that if you delete more than one can, the array is now messed up
        // Having to changed what part of the array they are in and link and get it to iterate correctly proved too difficult for me. LOL.
        // Hope this one is better than my first.
    }
}