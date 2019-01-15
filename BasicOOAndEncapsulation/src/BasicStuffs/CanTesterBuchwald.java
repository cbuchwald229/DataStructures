package BasicStuffs;

/**
 * @author Christina
 *
 */
public class CanTesterBuchwald {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CanBuchwald DelMonteCreamedCorn = new CanBuchwald();
		DelMonteCreamedCorn.setCompany("Del Monte");
		DelMonteCreamedCorn.setContents("Creamed Corn");
		DelMonteCreamedCorn.setSize(14.75);
		DelMonteCreamedCorn.setPrice(0.99);
		CanBuchwald DelMontePeaches = new CanBuchwald("Del Monte", "Peaches", 29.0, 2.22);
		CanBuchwald LibbysPumpkin = new CanBuchwald("Libbys", "Pumpkin", 15.0, 2.19);
		CanBuchwald DelMonteGreenBeans = new CanBuchwald("Del Monte", "Green Beans", 14.5, 0.99);
		System.out.println("Can 1 " + DelMonteCreamedCorn.toString());
		System.out.println("Can 2 " + DelMontePeaches.toString());
		System.out.println("Can 3 " + LibbysPumpkin.toString());
		System.out.println("Can 4 " + DelMonteGreenBeans.toString());
	}
}
