package measurements;

/**
 * @author Christina
 *
 */
public class Rectangle implements Measurements {
	
	public double length;
	public double width;
	
	/**
	 * 
	 */
	public Rectangle() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see measurements.Measurements#perimeter()
	 */
	@Override
	public void perimeter() {
		double l = getLength();
		double w = getWidth();
		double p = ((2*l)+(2*w));
		System.out.println("Perimeter: " + p);
	}
	
	/* (non-Javadoc)
	 * @see measurements.Measurements#area()
	 */
	@Override
	public void area() {
		double l = getLength();
		double w = getWidth();
		double a = l*w;
		System.out.println("Area: " + a);
	}
	
	/**
	 * @return
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * @param length
	 * @throws Exception
	 */
	public void setLength(double length) throws Exception {
		if (length < 0) {
			throw new Exception("Please use a number over zero.");
		} else {
			this.length = length;
		}
	}

	/**
	 * @return
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * @param width
	 * @throws Exception
	 */
	public void setWidth(double width) throws Exception {
		if (width < 0) {
			throw new Exception("Please use a number over zero.");
		} else {
			this.width = width;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}
