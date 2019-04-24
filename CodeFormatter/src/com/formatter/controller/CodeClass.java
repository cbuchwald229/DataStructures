package com.formatter.controller;

/**
 * @author Christina
 *
 */
public class CodeClass {
	// Properties
	public int numberOfItems;
	public String items;
	
	// Constructors
	/**
	 * 
	 */
	public CodeClass() {
		super();
	}
	
	/**
	 * @param numberOfItems
	 * @param items
	 */
	public CodeClass(int numberOfItems, String items) {
		super();
		this.numberOfItems = numberOfItems;
		this.items = items;
	}

	// Getters and Setters
	/**
	 * @return
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * @param numberOfItems
	 */
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	/**
	 * @return
	 */
	public String getItems() {
		return items;
	}

	/**
	 * @param items
	 */
	public void setItems(String items) {
		this.items = items;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CodeClass [numberOfItems=" + numberOfItems + ", items=" + items + "]";
	}
}