package recursion;

import java.util.Scanner;

// Recursion is the practice of calling a method within a method. Not just any method, but itself. 
// This is done until a certain point is reached. Once this happens, the method is exited. If you aren't careful, 
// you can create an infinite loop.
//
// In this example, the program not just calls itself once, but twice. 
// I started this program with it outputting the moves you would have to make to solve the puzzle. 
//Eventually, to get just the number of moves, I just had it pass one parameter, the piece in question. 
// Then each time a piece is "moved", a numberOfMoves variable is increased. Once complete, the main program prints it out.
/**
 * @author Christina
 *
 */
public class TowersOfHanoiBuchwald { 
	static int numberOfMoves = 0;
    /**
     * @param n
     */
    static void towerOfHanoi(int n) { 
        if (n == 1) 
        { 
        	numberOfMoves += 1;
        	//System.out.println(numberOfMoves);
            return; 
        } else {
	        towerOfHanoi(n-1); 
	        numberOfMoves += 1;
        	//System.out.println(numberOfMoves);
	        towerOfHanoi(n-1); 
        }
    } 
      
    //  Driver method 
    /**
     * @param args
     */
    public static void main(String args[]) 
    { 
		System.out.println("Please enter number of disks for this Tower of Hanoi: ");
		Scanner disks = new Scanner(System.in); // To gather information from the user
		int d; // To hold number of disks
		if(disks.hasNextInt()) {
			d = disks.nextInt();
			if(d <= 0) {
				System.out.println("Tower not made. Please use an integer/whole number above zero.");
			} else {
				towerOfHanoi(d);
				System.out.println(numberOfMoves + " moves for " + d + " disks.");
			}
		} else {
			System.out.println("Tower not made. Please use an integer/whole number above zero.");
		}
    } 
} 