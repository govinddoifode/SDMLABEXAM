

import java.util.Scanner;

public class MaxOfNumbers {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number ");
			double a = sc.nextDouble();
			System.out.println("Enter the second number ");
			double b = sc.nextDouble();
			double max = a;
			 if(a < b) { 
				 System.out.println("Max number is :" +b);
			 }else {
				 System.out.println("Max number is :" +a);
			 }
			
			 
	}

}
