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
	 * @throws Exception 
	 */
	public void push(String item) throws Exception {
		System.out.println("Push");
		if (topItem==(maxStackSize-1)) {
			throw new Exception("This stack is full.");
		} else {
			myStack[++topItem] = item;
		}
	}
	
	/**
	 * @return
	 * @throws Exception 
	 */
	public String pop() throws Exception {
		System.out.println("Pop");
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
		if (topItem == -1) {
			System.out.println("Stack is empty.");
		} else {
			System.out.println("Stack is not empty.");
		}
		return (topItem == -1);
	}
	

	/**
	 * @return
	 */
	public boolean isFull() {
		if (topItem == maxStackSize-1) {
			System.out.println("Stack is full.");
		} else {
			System.out.println("Stack is not full.");
		}
		return (topItem == maxStackSize-1);
	}
	
	/**
	 *
	 */
	public void size() {
		int value = topItem + 1;
		System.out.println("The stack size is: " + value);
	}
	
	/**
	 * 
	 */
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

	/**
	 * @return
	 */
	public String[] getMyStack() {
		return myStack;
	}

	/**
	 * @param myStack
	 */
	public void setMyStack(String[] myStack) {
		this.myStack = myStack;
	}

	/**
	 * @return
	 */
	public int getTopItem() {
		return topItem;
	}

	/**
	 * @param topItem
	 */
	public void setTopItem(int topItem) {
		this.topItem = topItem;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// May not use this 
	@Override
	public String toString() {
		return "Stack [maxStackSize=" + maxStackSize + ", myStack=" + Arrays.toString(myStack) + ", topItem="
				+ topItem + "]";
	}
}
