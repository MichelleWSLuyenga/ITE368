package first;
import java.util.*;

public class FirstJUnit {
	
	static double input1, input2, input3, result = 0.0;
	static String o1, o2;
	
	public static void main(String args[]) {
		
		Scanner calcu = new Scanner(System.in);
		
		System.out.println("Enter your number:  ");
		input1 = calcu.nextDouble();
		o1 = calcu.next();
		input2 = calcu.nextDouble();
		o2 = calcu.next();
		input3 = calcu.nextDouble();
		
			if(o2.equals("/")) {
			input2 = input2/input3;
			}else if(o2.equals("*")) {
			input2 = input2*input3;
			}else if(o2.equals("+")) {
			input2 = input2+input3;
			}else if(o2.equals("-")) {
			input2 = input2-input3;
			}
			
			if(o1.equals("/")) {
			input1 = input1/input2;
			}else if(o1.equals("*")) {
			input1 = input1*input2;
			}else if(o1.equals("+")) {
			input1 = input1+input2;
			}else if(o1.equals("-")) {
			input1 = input1-input2;
			}
		
		result += input1;
		System.out.println(result);
		
	}
	
	
}







