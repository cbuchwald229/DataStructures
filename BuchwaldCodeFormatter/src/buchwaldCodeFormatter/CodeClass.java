package buchwaldCodeFormatter;

public class CodeClass {
	// Properties
	public int numberOfProperties;
	public int numberOfConstructors;
	public int numberOfMethods;
	public int numberOfGettersSetters;
	public int numberOfToStrings;
	public String property;
	public String constructor;
	public String method;
	public String getterSetter;
	public String toString;
	
	// Constructors
	public CodeClass() {
		super();
	}
	
	public CodeClass(int numberOfProperties, int numberOfConstructors, int numberOfMethods, int numberOfGettersSetters,
			int numberOfToStrings, String property, String constructor, String method, String getterSetter,
			String toString) {
		super();
		this.numberOfProperties = numberOfProperties;
		this.numberOfConstructors = numberOfConstructors;
		this.numberOfMethods = numberOfMethods;
		this.numberOfGettersSetters = numberOfGettersSetters;
		this.numberOfToStrings = numberOfToStrings;
		this.property = property;
		this.constructor = constructor;
		this.method = method;
		this.getterSetter = getterSetter;
		this.toString = toString;
	}

	// Getters and Setters
	public int getNumberOfProperties() {
		return numberOfProperties;
	}

	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}

	public int getNumberOfConstructors() {
		return numberOfConstructors;
	}

	public void setNumberOfConstructors(int numberOfConstructors) {
		this.numberOfConstructors = numberOfConstructors;
	}

	public int getNumberOfMethods() {
		return numberOfMethods;
	}

	public void setNumberOfMethods(int numberOfMethods) {
		this.numberOfMethods = numberOfMethods;
	}

	public int getNumberOfGettersSetters() {
		return numberOfGettersSetters;
	}

	public void setNumberOfGettersSetters(int numberOfGettersSetters) {
		this.numberOfGettersSetters = numberOfGettersSetters;
	}

	public int getNumberOfToStrings() {
		return numberOfToStrings;
	}

	public void setNumberOfToStrings(int numberOfToStrings) {
		this.numberOfToStrings = numberOfToStrings;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getConstructor() {
		return constructor;
	}

	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getGetterSetter() {
		return getterSetter;
	}

	public void setGetterSetter(String getterSetter) {
		this.getterSetter = getterSetter;
	}

	public String getToString() {
		return toString;
	}

	public void setToString(String toString) {
		this.toString = toString;
	}

	// To String
	@Override
	public String toString() {
		return "CodeClass [numberOfProperties=" + numberOfProperties + ", numberOfConstructors=" + numberOfConstructors
				+ ", numberOfMethods=" + numberOfMethods + ", numberOfGettersSetters=" + numberOfGettersSetters
				+ ", numberOfToStrings=" + numberOfToStrings + ", property=" + property + ", constructor=" + constructor
				+ ", method=" + method + ", getterSetter=" + getterSetter + ", toString=" + toString + "]";
	}
}
