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
    	int max = 100;
    	ArrayLinkedList myList  = new ArrayLinkedList(max);
    	myList.setMaximum(max);
    	CanBuchwald[] canArray = new CanBuchwald[max];
    	
    	// Create some cans
		canArray[0] = new CanBuchwald("Del Monte", "Peaches", 29.0, 2.22);
		canArray[1] = new CanBuchwald("Libbys", "Pumpkin", 15.0, 2.19);
		canArray[2] = new CanBuchwald("Del Monte", "Green Beans", 14.5, 0.99);
		canArray[3] = new CanBuchwald("Del Monte", "Creamed Corn", 14.75, 0.99);
		canArray[4] = new CanBuchwald("My Brand", "Carrots", 4.50, 10.00);

		//Add cans to linked list
		for(int i = 0; i < canArray.length; i++) {
	        try {
	        	if(canArray[i]!=null ) {
					myList.insertLink(canArray[i]);
					System.out.println("Item added");
	        	} else {
	        		break;
	        	}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
        
		//Delete a can
		try {
			myList.deleteLink(canArray[4]);
			System.out.println("Item deleted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
        //Print out what is in the linked list
        System.out.println("Linked List items: ");
        for(int i = 0; i < myList.getSize(); i++)
        {
            System.out.println("-" + myList.getList()[i].getData());
        }
    }
}
