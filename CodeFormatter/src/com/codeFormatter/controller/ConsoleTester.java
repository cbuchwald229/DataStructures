package com.codeFormatter.controller;

import java.util.PriorityQueue;

public class ConsoleTester {
	public static void main(String[] args) {
		CodeClass catClass = new CodeClass(3, 
				"	public static int linearSearch(int maxSize, int key) {    \r\n" + 
				"        for(int i = 0; i < maxSize; i++) {    \r\n" + 
				"            if(a[i] == key){    \r\n" + 
				"                return i;    \r\n" + 
				"            }    \r\n" + 
				"        }    \r\n" + 
				"        return -1;    \r\n" + 
				"    } " +
				"    public static int binarySearch(int left, int right, int key) { \r\n" + 
				"        if (right >= left) { \r\n" + 
				"            int mid = left + (right - left) / 2; \r\n" + 
				"  \r\n" + 
				"            // If the element is present at the middle\r\n" + 
				"            if (a[mid] == key) {\r\n" + 
				"                return mid; \r\n" + 
				"            }\r\n" + 
				"  \r\n" + 
				"            // If element is smaller than mid, then it can only be present in left sub array \r\n" + 
				"            if (a[mid] > key) {\r\n" + 
				"                return binarySearch(left, mid - 1, key); \r\n" + 
				"            }\r\n" + 
				"  \r\n" + 
				"            // Else the element can only be present in right sub array \r\n" + 
				"            return binarySearch(mid + 1, right, key); \r\n" + 
				"        } \r\n" + 
				"        // We reach here when element is not present in array\r\n" + 
				"        return -1; \r\n" + 
				"    } " +
				"	public static int zapSearch(int maxSize, int key) {    \r\n" + 
				"        for(int i = 0; i < maxSize; i++) {    \r\n" + 
				"            if(a[i] == key){    \r\n" + 
				"                return i;    \r\n" + 
				"            }    \r\n" + 
				"        }    \r\n" + 
				"        return -1;    \r\n" + 
				"    } ") ;
		
		CodeFormatter codeFormatter = new CodeFormatter();
		PriorityQueue<String> result = codeFormatter.formatCode(catClass.items, catClass.numberOfItems);		
		String myResult = codeFormatter.myVersionToString(result, catClass.numberOfItems);
		
		System.out.println(myResult);
	}
}