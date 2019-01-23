package measurements;

import java.util.Scanner;

import bicycle.Bicycle;

/**
 * @author Christina
 *
 */
public class MeasurementsTester {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate a rectangle
		Rectangle Sean = new Rectangle();
		// Get rectangle info from user
		System.out.println("Please enter length of Rectangle: ");
		Scanner length = new Scanner(System.in);
		double l;
		if(length.hasNextDouble()) {
		    l = length.nextDouble();
			try {
				Sean.setLength(l);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			if (l > 0) {
				System.out.println("Please enter width of Rectangle: ");
				Scanner width = new Scanner(System.in);
				double w;
				if(width.hasNextDouble()) {
				    w = width.nextDouble();
					try {
						Sean.setWidth(w);
					} catch (Exception e) {
						System.out.println(e.getMessage());		}
					if (l > 0 && w > 0)
					{
						Sean.perimeter();
						Sean.area();
					} else {
						System.out.println("Rectangle not made");
					}
				}
			} else {
				System.out.println("Rectangle not made");
			}
		} else {
			System.out.println("Rectangle not made");
		}
			
		// Instantiate a square
		Square Gus = new Square();
		// Get square info from user
		System.out.println("Please enter sides of Square: ");
		Scanner sides = new Scanner(System.in);
		double s;
		if(sides.hasNextDouble()) {
		    s = sides.nextDouble();
			try {
				Gus.setSides(s);
			} catch (Exception e) {
				System.out.println(e.getMessage());		}
			if (s > 0)
			{
				Gus.perimeter();
				Gus.area();
			} else {
				System.out.println("Square not made");
			}
		} else {
			System.out.println("Square not made");
		}
	}
}
// This is not the most elegant program I have ever made, but hey, it works.