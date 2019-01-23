package bicycle;

public class Bicycle extends Cycle {

	/**
	 * 
	 */
	// Constructors
	public Bicycle() {
		super();
	}
	
	/**
	 * @param numberOfTires
	 * @param numberOfFlats
	 * @throws Exception 
	 */
	public Bicycle(int numberOfTires, int numberOfFlats) throws Exception {
		super();
		try {
			setNumberOfTires(numberOfTires);
			setNumberOfFlats(numberOfFlats);
		} catch (Exception e) {
			throw new Exception("Bicycle not created!");
		}
	}
	
	/* (non-Javadoc)
	 * @see bicycle.Cycle#ride()
	 */
	@Override
	public void ride() {
		System.out.println("The bicycle is moving.");
	}

	/* (non-Javadoc)
	 * @see bicycle.Cycle#stop()
	 */
	@Override
	public void stop() {
		System.out.println("The bicycle has stopped.");
	}
	
	/**
	 * 
	 */
	// Another version of the to string as a method
	public void tireStatus() {
		System.out.println("This bike has " + numberOfTires + " number of tires and " + numberOfFlats + " number of flats.");
	}
	
	/**
	 * @return
	 */
	// getters and setters
	public int getNumberOfTires() {
		return numberOfTires;
	}

	/**
	 * @param numberOfTires
	 * @throws Exception 
	 */
	public void setNumberOfTires(int numberOfTires) throws Exception {
		if (numberOfTires < 0) {
			throw new Exception("That number of tires isn't possible.");
		}
		this.numberOfTires = numberOfTires;
		
	}

	/**
	 * @return
	 */
	public int getNumberOfFlats() {
		return numberOfFlats;
	}

	/**
	 * @param numberOfFlats
	 * @throws Exception 
	 */
	public void setNumberOfFlats(int numberOfFlats) throws Exception {
		//This if statement makes sure there aren't more flats than tires possible on bike
		if (numberOfFlats > numberOfTires) {
			throw new Exception("That number of flats isn't possible.");
		}
		this.numberOfFlats = numberOfFlats;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cycle [numberOfTires=" + numberOfTires + ", numberOfFlats=" + numberOfFlats + "]";
	}
}
