package postfix;

import java.util.Stack; 

/**
 * @author Christina
 *
 */
public class InfixToPostfix {
	// Java program to change infix to postfix
	 
	 /**
	 * @param character
	 * @return
	 */
	// A function to determine precedence of a given operator
	static int Precedence(char character) 
	 { 
	     switch (character) 
	     { 
	     case '+': 
	     case '-': 
	         return 1; 
	    
	     case '*': 
	     case '/': 
	         return 2; 
	    
	     case '^': 
	         return 3; 
	     } 
	     return -1; 
	 } 
	    
	 // The method by which infix is changed to postfix.  
	 /**
	 * @param expression
	 * @return
	 * @throws Exception 
	 */
	static String infixToPostfix(String expression) throws Exception 
	 { 
	     // Initializing empty String for result 
	     String output = new String(""); 
	       
	     // Initializing empty stack 
	     Stack<Character> stack = new Stack<>(); 
	       
	     for (int x = 0; x<expression.length(); ++x) 
	     { 
	         char c = expression.charAt(x); 
	           
	          // If the scanned character is an operand, add it to output. 
	         if (Character.isLetterOrDigit(c)) 
	        	 output += c; 
	            
	         // If the scanned character is an '(', push it to the stack. 
	         else if (c == '(') 
	             stack.push(c); 
	           
	         //  If the scanned character is an ')', pop and output from the stack until an '(' is encountered. 
	         else if (c == ')') 
	         { 
	             while (!stack.isEmpty() && stack.peek() != '(') 
	            	 output += stack.pop(); 
	               
	             if (!stack.isEmpty() && stack.peek() != '(') 
	                 return "Invalid Expression"; // invalid expression                 
	             else
	                 stack.pop(); 
	         } 
	         else if (c=='+' || c=='-' || c=='*' || c=='/')
	         // When an operator is encountered 
	         { 
	             while (!stack.isEmpty() && Precedence(c) <= Precedence(stack.peek())) 
	            	 output += stack.pop(); 
	             stack.push(c); 
	         } 
	         else
	         {
	        	 throw new Exception("The program encountered a character that isn't an operator or operand.");
	         }
	     } 
	    
	     // pop all the operators from the stack 
	     while (!stack.isEmpty()) 
	    	 output += stack.pop(); 
	    
	     return output; 
	 } 
	/**
	 * @param args
	 */
	public static void main(String[] args)  
	{ 
	    String expression = "a+b*(c/d-e)*(f+g*h)-i"; 
	    try {
			System.out.println(infixToPostfix(expression));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	} 
}