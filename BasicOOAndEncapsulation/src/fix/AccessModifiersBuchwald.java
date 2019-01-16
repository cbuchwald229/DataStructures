package fix;

/**
 * @author Christina
 *
 */
public class AccessModifiersBuchwald {	
	//Variables are set to private so they are visible only in the class
	private int age; // This line was missing it's access modifier
	private double gpa; // This line was protected so I changed it to private
	private String name; // This line was missing it's access modifier
	private String studentID; // This line was missing it's access modifier
	
	/**
	 * 
	 */
	// Added this default constructor
	public AccessModifiersBuchwald() {
		super();
	}
	/**
	 * @param age
	 * @param gpa
	 * @param name
	 * @param studentID
	 */
	// Added this non default constructor with all variables/parameters included
	public AccessModifiersBuchwald(int age, double gpa, String name, String studentID) {
		super();
		this.age = age;
		this.gpa = gpa;
		this.name = name;
		this.studentID = studentID;
	}
	/**
	 * @return
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public int getAge() {
		return age;
	}
	/**
	 * @param age
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	public String getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID
	 */
	// This setter was missing altogether
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// Changed all access modifiers for methods for getters and setters to public 
	// so they are visible/usable outside the class.
	@Override
	public String toString() {
		return "AccessModifiers [age=" + age + ", gpa=" + gpa + ", name=" + name + ", studentID=" + studentID + "]";
	}
}
