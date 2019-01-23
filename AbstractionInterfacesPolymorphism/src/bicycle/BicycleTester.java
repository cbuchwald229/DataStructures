package bicycle;

/**
 * @author Christina
 *
 */
public class BicycleTester {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// Instantiate a bicycle names after a princess with no tires or flats
		Bicycle SnowWhite = new Bicycle();
		
		SnowWhite.ride();
		SnowWhite.stop();
		SnowWhite.tireStatus();
		
		// Instantiate a bicycle named after a princess with tires and a flat
		Bicycle Ariel = new Bicycle(2, 1);
		Ariel.ride();
		Ariel.stop();
		System.out.println("This bicycle: " + Ariel);		
	}
}
