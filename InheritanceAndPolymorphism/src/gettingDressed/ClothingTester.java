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
		System.out.println("Clothing 1:" + dress);
		System.out.println("Clothing 1:" + suit);
		dress.setSize("Large");
		dress.setColor("Purple");
		System.out.println("Clothing 1:" + dress);
		System.out.println("Clothing 1:" + suit);
	}
}
