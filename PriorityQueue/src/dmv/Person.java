package dmv;

/**
 * @author Christina
 *
 */
public class Person {
	// Properties
	private int idnumber;
	private int priority;	
	
	// Constructor
	/**
	 * @param id
	 * @param p
	 */
	public Person(int id, int p) {
		idnumber = id;
		priority = p;
	}

	// Getters and Setters
	/**
	 * @return
	 */
	public int getIdnumber() {
		return idnumber;
	}

	/**
	 * @param idnumber
	 */
	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	/**
	 * @return
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [idnumber=" + idnumber + ", priority=" + priority + "]";
	}
}
