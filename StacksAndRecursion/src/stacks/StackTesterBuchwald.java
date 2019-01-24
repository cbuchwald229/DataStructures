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
			theStack.push("redShirt");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			theStack.push("greenSkirt");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			theStack.push("yellowLeggings");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			theStack.push("purpleSock");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			theStack.push("pinkSock");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}

		
		// Print the stack and show size
		theStack.print();
		theStack.size();
		
		// Add a shirt and show size
		try {
			theStack.push("blueShirt");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		theStack.size();
		
		// Remove two items and show size
		try {
			theStack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			theStack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		theStack.size();
		
		// Pop and print 
		try {
			theStack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		theStack.print();
		
		// Print the top, pop two more, and print
		theStack.top();
		try {
			theStack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		try {
			theStack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		theStack.print();
		
		// Show size, ask if it's empty, print
		theStack.size();
		theStack.isEmpty();
		theStack.print();
	}
}
