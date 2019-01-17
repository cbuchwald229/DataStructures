package gettingDressed;

/**
 * @author Christina
 *
 */
public class ClothingTester {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Testing the super class Clothing
		Clothing dress = new Clothing();
		Clothing suit = new Clothing("X-Large", "Heathered Gray");
		// Display current state of objects
		System.out.println("Clothing 1:" + dress);
		System.out.println("Clothing 2:" + suit);
		dress.setSize("Large");
		dress.setColor("Purple");
		// Display current state of objects
		System.out.println("Clothing 1:" + dress);
		System.out.println("Clothing 2:" + suit);
	}
}
