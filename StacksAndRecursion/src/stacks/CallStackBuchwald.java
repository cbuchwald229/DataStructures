package stacks;

public class CallStackBuchwald {
	
    public static void method1(){
    	System.out.println("In method1"); 
    	System.out.println("Exiting method1");
    }
    
    public static void method2(){
    	System.out.println("In method2"); 
    	method3();
    	System.out.println("Exiting method2");
    }
    
    public static void method3(){
    	System.out.println("In method3"); 
    	method4();
    	System.out.println("Exiting method3");
    }
    
    public static void method4(){
    	System.out.println("In method4"); 
    	System.out.println("Exiting method4");
    }
	public static void main(String[] args) {
		System.out.println("In main method");
		method1();
		method4();
		method3();
		method2();
		method3();
		method4();
		System.out.println("Exiting main");
	}

}