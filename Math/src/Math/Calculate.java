package Math;
import java.util.*;
public class Calculate {
	static int num = 0; 
	static int num1;
	static int num2;
	int total = 0;
	static String ope, ope1;
	
		public static void main(String[] args) {
			Scanner op = new Scanner(System.in);
	        	
	        System.out.print("Enter your number: ");
	        num = op. nextInt();	        
	        System.out.print("Enter your operation: ");
	        ope = op.next(); 
	        System.out.print("Enter your number: ");
	        num1 = op. nextInt();	        
	        System.out.print("Enter your operation: ");
	        ope1 = op.next(); 
	        System.out.print("Enter your number: ");
	        num2 = op. nextInt();
	        
	        	            
	        if(ope1.equals("/") || ope1.equals("*")) {
	        	divide();
	        }
	        if(ope1.equals("+") || ope1.equals("-")) {
	        	addition();
	        }
	        
	
	}
	
	public static int divide() {
		if(ope1 == "/") {
			
		}
		return num/num1;
	}
	
	public static int multiply() {
		return num*num1;
	}
	
	public static int addition() {
		return num+num1;
	}
	
	public static int substract() {
		return num-num1;
	}
	
	
	
	
	
	
	
	
	
	
	
}
