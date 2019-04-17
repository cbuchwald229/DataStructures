package buchwaldCodeFormatter;

public class CodeTester {
	public static void main(String[] args) {
		CodeClass catClass = new CodeClass(1, 1, 1, 2, 1, "String breed; ", "public Cat() {\n \tsuper();\n }", "public String meow() { System.out.println(\"Meow\"); }",
				"public String getBreed() { return Breed; } public String setBreed(String Breed) { this.Breed = breed }", 
				"public String toString() {return \"Cat [breed=\" + breed + \"]\";}");
		
		CodeFormatter codeFormatter = new CodeFormatter();
		
		String result = codeFormatter.formatConstructors(catClass.constructor, catClass.numberOfConstructors);
		System.out.println(result);
	}
}