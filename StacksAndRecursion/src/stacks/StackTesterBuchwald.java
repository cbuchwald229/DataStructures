package stacks;

/**
 * @author Christina
 *
 */
public class StackTesterBuchwald {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate the stack and it's size
		int stackSize = 5;
		StackBuchwald theStack = new StackBuchwald(stackSize);
		
		// I would totally wear this :P
		try {
			String item = theStack.push("redShirt");
			System.out.println("Push " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			String item = theStack.push("greenSkirt");
			System.out.println("Push " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			String item = theStack.push("yellowLeggings");
			System.out.println("Push " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			String item = theStack.push("purpleSock");
			System.out.println("Push " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			String item = theStack.push("pinkSock");
			System.out.println("Push " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}

		
		// Print the stack and show size
		theStack.print();
		int currSize = theStack.size();
		System.out.println("The stack size is: " + currSize);
		
		// Add a shirt and show size
		try {
			String item = theStack.push("blueShirt");
			System.out.println("Push " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		int currSize1 = theStack.size();
		System.out.println("The stack size is: " + currSize1);
		
		// Remove two items and show size
		try {
			String item = theStack.pop();
			System.out.println("Pop " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			String item = theStack.pop();
			System.out.println("Pop " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		int currSize2 = theStack.size();
		System.out.println("The stack size is: " + currSize2);
		
		// Pop and print 
		try {
			String item = theStack.pop();
			System.out.println("Pop " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		theStack.print();
		
		// Print the top, pop two more, and print
		String topItem = theStack.top();
		System.out.println("Top Item = " + topItem);
		try {
			String item = theStack.pop();
			System.out.println("Pop " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			String item = theStack.pop();
			System.out.println("Pop " + item);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		theStack.print();
		
		// Show size, ask if it's empty, print
		int currSize3 = theStack.size();
		System.out.println("The stack size is: " + currSize3);
		if(theStack.isEmpty()) {
				System.out.println("The stack is empty.");
			} else {
				System.out.println("The stack is not empty.");
			}
		theStack.print();
	}
}
