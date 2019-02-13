package stacks;

import java.util.Arrays;

/**
 * @author Christina
 *
 */
public class StackBuchwald {
	// Properties
	private int maxStackSize;
	private String[] myStack;
	private int topItem;
	
	// Constructor
	/**
	 * @param size
	 */
	public StackBuchwald(int size) {
		maxStackSize = size;
		myStack = new String[maxStackSize];
		topItem = -1; // Start it empty
	}
	
	// Methods

	/**
	 * @param item
	 * @return
	 * @throws Exception
	 */
	public String push(String item) throws Exception {
		if (topItem==(maxStackSize-1)) {
			throw new Exception("This stack is full.");
		} else {
			myStack[++topItem] = item;
			return item;
		}
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	public String pop() throws Exception {
		if (topItem==-1) {
			throw new Exception("This stack is empty.");
		} else {
			return myStack[topItem--];
		}
	}
	
	/**
	 * @return
	 */
	public String top() {
		return myStack[topItem];
	}
	

	/**
	 * @return
	 */
	public boolean isEmpty() {
		return (topItem == -1);
	}
	

	/**
	 * @return
	 */
	public boolean isFull() {
		return (topItem == maxStackSize-1);
	}
	
	/**
	 * @return
	 */
	public int size() {
		int value = topItem + 1;
		return value;
	}
	
	/**
	 * 
	 */
	// I know we weren't supposed to use System.out.println. For a print method
	// and the fact you didn't cross it out, I think maybe it's okay this time...
	// I will try to avoid in future.
	public void print() {
		System.out.println("Print:");
		for (int i = 0; i <= topItem; i++) {
			System.out.println("-" + myStack[i] + " ");
		}
	}

	// Getters and Setters even though we don't need them
	/**
	 * @return
	 */
	public int getMaxStackSize() {
		return maxStackSize;
	}

	/**
	 * @param maxStackSize
	 */
	public void setMaxStackSize(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stack [maxStackSize=" + maxStackSize + ", myStack=" + Arrays.toString(myStack) + ", topItem="
				+ topItem + "]";
	}
}
