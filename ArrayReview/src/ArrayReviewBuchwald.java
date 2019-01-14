import java.util.Arrays;
import java.util.Random;

/**
 * @author Christina
 *
 */
public class ArrayReviewBuchwald {
    /**
     * @param args
     */
    public static void main(String[] args) {
		// Declaring a constant to hold the array size
		final int ARRAY_SIZE = 10;
		
		// Declaring the array with desired size
		int[] myArray = new int[ARRAY_SIZE]; 
		
		// Fill array with random number between 1-25
		for (int i = 0; i < myArray.length; i++) {
		    Random r = new Random();
		    int randomNum = r.nextInt(24) + 1;
		    myArray[i] = randomNum; 
		}
		
		// Print out the numbers in the array
		for (int element : myArray) {
		    System.out.println(element + " ");
		}
		
		// Print out the number in the specified format
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("MyArray element at index[" + i + "] = " + myArray[i]);
		}
	}
}