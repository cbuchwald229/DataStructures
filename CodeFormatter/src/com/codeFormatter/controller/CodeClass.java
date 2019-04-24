package com.codeFormatter.controller;

public class CodeClass {
	// Properties
	public int numberOfItems;
	public String items;
	
	// Constructors
	public CodeClass() {
		super();
	}
	
	public CodeClass(int numberOfItems, String items) {
		super();
		this.numberOfItems = numberOfItems;
		this.items = items;
	}

	// Getters and Setters
	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "CodeClass [numberOfItems=" + numberOfItems + ", items=" + items + "]";
	}
}