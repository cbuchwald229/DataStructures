package measurements;

/**
 * @author Christina
 *
 */
public class Square implements Measurements {
	
	public double sides;
	
	/**
	 * 
	 */
	public Square() {
		super();
	}

	/* (non-Javadoc)
	 * @see measurements.Measurements#perimeter()
	 */
	@Override
	public String perimeter() {
		double s = getSides();
		double p = (4*s);
		return ("Perimeter: " + p);
	}

	/* (non-Javadoc)
	 * @see measurements.Measurements#area()
	 */
	@Override
	public String area() {
		double s = getSides();
		double a = s*s;
		return ("Area: " + a);
	}

	/**
	 * @return
	 */
	public double getSides() {
		return sides;
	}

	/**
	 * @param sides
	 * @throws Exception
	 */
	public void setSides(double sides) throws Exception {
		if (sides < 0) {
			throw new Exception("Please use a number over zero.");
		} else {
			this.sides = sides;
		}
	}
}
