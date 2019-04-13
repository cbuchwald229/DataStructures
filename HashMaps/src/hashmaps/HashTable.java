package hashmaps;

/**
 * @author Christina
 *
 */
public class HashTable {
	// Array holds hash table
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;
	
	// Constructor
	/**
	 * @param size
	 */
	public HashTable(int size) {
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1, "", ""); // Deleted item key is -1
	}
	
	/**
	 * @return
	 */
	public String displayTable() {
		String display = "Table: ";
		for(int j = 0; j < arraySize; j++) {
			if(hashArray[j] != null) {
				display = display + hashArray[j].getKey() + " ";
			} else {
				display = display + "** ";
			}
		}
		return display;
	}
	
	/**
	 * @param key
	 * @return
	 */
	public int hashFunc(int key) {
		return key % arraySize;
	}
	
	public void insert(DataItem item) throws Exception {
		int key = item.getKey();
		int hashVal = hashFunc(key);
		if(hashVal > arraySize) {
			throw new Exception("This table is full.");
		} else {
			while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
				++hashVal;
				hashVal %= arraySize; // Wrap around if necessary
			}
			
			hashArray[hashVal] = item;
		}
	}
	
	public DataItem delete(int key) throws Exception {
		int hashVal = hashFunc(key);
		
		if(hashArray[hashVal] == null) {
			throw new Exception("Item not here. Try again.");
		} else {
			while(hashArray[hashVal] != null) {
				if(hashArray[hashVal].getKey() == key) {
					DataItem temp = hashArray[hashVal]; // Save item
					hashArray[hashVal] = nonItem; // Delete item
					return temp; // Return item
				}
				++hashVal;
				hashVal %= arraySize; // Wrap around if necessary
			}
			return null;
		}
	}
	
	public String find(int key) {
		int hashVal = hashFunc(key);
		
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].getKey() == key) {
				String objectInfo = hashArray[hashVal].toString();
				return objectInfo;
			}
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}
}
