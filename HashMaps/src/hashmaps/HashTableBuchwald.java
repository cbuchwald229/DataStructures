package hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Christina
 *
 */
public class HashTableBuchwald {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		final int SIZE = 10;
		String output = "";
		
		// Make table
		HashTable theHashTable = new HashTable(SIZE);
		
		// Insert information
		DataItem aDataItem1 = new DataItem(1, "easteregg@hotmail.com", "Bunny");
		try {
			theHashTable.insert(aDataItem1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(aDataItem1.getKey() + " " + aDataItem1.getEmail() + " " + aDataItem1.getName() + " inserted.");
		DataItem aDataItem2 = new DataItem(2, "rainbow@gold.com", "Leprechaun");
		try {
			theHashTable.insert(aDataItem2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(aDataItem2.getKey() + " " + aDataItem2.getEmail() + " " + aDataItem2.getName() + " inserted.");
		DataItem aDataItem3 = new DataItem(3, "cookiesAndMilk@northPole.com", "Santa");
		try {
			theHashTable.insert(aDataItem3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(aDataItem3.getKey() + " " + aDataItem3.getEmail() + " " + aDataItem3.getName() + " inserted.");
		
		// Find by key
		output = theHashTable.find(1);
		if(output != null) {
			System.out.println("Found " + output);
		} else {
			System.out.println("Could not find 1");
		}
		
		output = theHashTable.find(4);
		if(output != null) {
			System.out.println("Found " + output);
		} else {
			System.out.println("Could not find 4");
		}
		
		output = theHashTable.find(2);
		if(output != null) {
			System.out.println("Found " + output);
		} else {
			System.out.println("Could not find 2");
		}
	}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
