package searchAndsort;

/**
 * @author Christina
 *
 */
public class ArrayIns {
	private int[] a; // reference to array a
	private int nElems; // number of data items

	/**
	 * @param max
	 */
	public ArrayIns(int max) // constructor
	{
		a = new int[max]; // create the array
		nElems = 0; // no items yet
	}

	/**
	 * @param value
	 */
	public void insert(int value) { // put element into array
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	/**
	 * 
	 */
	public void display() { // displays array contents
		for (int j = 0; j < nElems; j++) { // for each element,
			System.out.print(a[j] + " "); // display it
			System.out.println("");
		}
	}

	/**
	 * 
	 */
	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElems; out++) { // out is dividing line
			int temp = a[out]; // remove marked item
			in = out; // start shifts at out
			while (in > 0 && a[in - 1] >= temp) // until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				--in; // go left one position
			}
			a[in] = temp; // insert marked item
		} 
	} 
	
	/**
	 * @param maxSize
	 * @param key
	 * @return
	 */
	// This algorithm searches it one by one from the beginning. This is best used for smaller sets or
	// sets that are not sorted. This is not good for larger sets as it can take a long time going one by one.
	public int linearSearch(int maxSize, int key) {    
        for(int i = 0; i < maxSize; i++) {    
            if(a[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    } 

    /**
     * @param left
     * @param right
     * @param key
     * @return
     */
	// A binary search splits a sorted list in half and keeps checking for larger or smaller and continually splitting and recursively calling
	// the algorithm until the item is found. Greater for larger searches but not good for unsorted lists
    public int binarySearch(int left, int right, int key) { 
        if (right >= left) { 
            int mid = left + (right - left) / 2; 
  
            // If the element is present at the middle
            if (a[mid] == key) {
                return mid; 
            }
  
            // If element is smaller than mid, then it can only be present in left sub array 
            if (a[mid] > key) {
                return binarySearch(left, mid - 1, key); 
            }
  
            // Else the element can only be present in right sub array 
            return binarySearch(mid + 1, right, key); 
        } 
        // We reach here when element is not present in array
        return -1; 
    } 
    
	/**
	 * @param x
	 * @return
	 */
	public  int getA(int x) {
		return a[x];
	}

	/**
	 * @param a
	 */
	public void setA(int[] a) {
		this.a = a;
	}
}

/**
 * @author Christina
 *
 */
class InsertSortApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxSize = 275000; // array size
		int key = 11;
		ArrayIns arr; // reference to array
		arr = new ArrayIns(maxSize); // create the array
		for(int j = 0; j < maxSize; j++) // fill array with random numbers 
		{
		  int n = (int)( java.lang.Math.random()*(maxSize-1) );
		  arr.insert(n);
		}
		long result1 = arr.linearSearch(maxSize, key);
        System.out.println(key + " is found at index: " + result1);
		//arr.display(); // display items
		long time1 = System.nanoTime();
		arr.insertionSort(); // insertion-sort them
		long time2 = System.nanoTime();
		long timeTaken = time2 - time1;
		long secondsTaken = timeTaken/1000000000;
		//arr.display(); // display them again
        long result2 = arr.binarySearch(arr.getA(0), arr.getA((maxSize-1)), key);
        System.out.println(key + " is found at index: " + result2);
        System.out.println("The sort took " + timeTaken + " nanoseconds.");
        System.out.println("The sort took " + secondsTaken + " seconds.");
	}
}