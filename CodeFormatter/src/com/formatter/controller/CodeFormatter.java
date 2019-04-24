package com.formatter.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import org.springframework.util.StringUtils;


public class CodeFormatter {
	public CodeClass codeClass;
	
	// Constructor
	public CodeFormatter() {
		super();
	}
	
	// Methods	
	public PriorityQueue<String> formatCode(String inString) {
		PriorityQueue<String> codeList = new PriorityQueue<>();
		int codeCount = 0;
		int inNumber = findNumOfItems(inString);
		
	    while(codeCount < inNumber){
	    	String[] section = splitString(inString);
	    	codeList.add(section[0]);
	    	inString = section[1];
	    	codeCount++;
    	}
	    
	    codeList = bubbleSort(inNumber, codeList);
		return codeList;
	}
	
	public String[] splitString(String inString) {
		String a[] = new String[2];
		PriorityQueue<Integer> beginningIndexes = new PriorityQueue<>();
		
		for (int index = inString.indexOf("public"); index != -1; index = inString.indexOf("public", index + 1))
		{
			beginningIndexes.add(index);
		}
		for (int index = inString.indexOf("protected"); index != -1; index = inString.indexOf("protected", index + 1))
		{
			beginningIndexes.add(index);
		}
		for (int index = inString.indexOf("private"); index != -1; index = inString.indexOf("private", index + 1))
		{
			beginningIndexes.add(index);
		}
		
		if(beginningIndexes.size() > 1) {
			beginningIndexes.remove();
			int endMethodIndex = beginningIndexes.element();
			
			a[0] = ("\n" + (inString.substring(0, endMethodIndex)).trim() + "\n");
			a[1] = (inString.substring(endMethodIndex)).trim();
		} else {			
			a[0] = ("\n" + (inString).trim() + "\n");
			a[1] = "";
		}
		return a;
	}
	
	public int findNumOfItems(String inString) {
		PriorityQueue<Integer> beginningIndexes = new PriorityQueue<>();
		
		for (int index = inString.indexOf("public"); index != -1; index = inString.indexOf("public", index + 1))
		{
			beginningIndexes.add(index);
		}
		for (int index = inString.indexOf("protected"); index != -1; index = inString.indexOf("protected", index + 1))
		{
			beginningIndexes.add(index);
		}
		for (int index = inString.indexOf("private"); index != -1; index = inString.indexOf("private", index + 1))
		{
			beginningIndexes.add(index);
		}
		return beginningIndexes.size();
	}
	
	public PriorityQueue<String> bubbleSort(int nElems, PriorityQueue<String> inElement) {
		int out, in;
		PriorityQueue<String> newCodeList = new PriorityQueue<>();
		Object[] inArray = inElement.toArray(); 
		for(out = nElems - 1; out > 1; out--) { // outer loop (backward)
			for(in = 0; in < out; in++) { // inner loop (forward)
				if(inArray[in].toString().compareToIgnoreCase(inArray[in+1].toString()) > 0) { // out of order?
					swap(in, in+1, inArray); // swap them
				}
			}
		}
		for(int i = 0; i < nElems; i++) {
			newCodeList.add(inArray[i].toString());
		}
		return newCodeList;
	}
	
	private void swap(int one, int two, Object[] inArray) {
		String temp = inArray[one].toString();
		inArray[one] = inArray[two].toString();
		inArray[two] = temp;
	}
	
	public String myVersionToString(PriorityQueue<String> inQueue, int inNumber) {
		String myResult = "";
		for(int i = 0; i < inNumber; i++) {
			myResult = myResult + inQueue.remove();
		}
		return myResult;
	}
}
