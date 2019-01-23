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
		try {
			dress.setSize("Large");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		dress.setColor("Purple");
		// Display current state of objects
		System.out.println("Clothing 1:" + dress);
		System.out.println("Clothing 2:" + suit);
		// Make some jeans
		Pant jeans = new Pant();
		jeans.setColor("Blue");
		jeans.setLength(32);
		try {
			jeans.setSize("12");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Make a shirt
		Shirt tshirt = new Shirt();
		tshirt.setColor("");
		try {
			tshirt.setSize("J");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			tshirt.setSleeve("something");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Print out the new clothes
		System.out.println("Clothing 3:" + jeans);
		System.out.println("Clothing 4:" + tshirt);
	}
}
