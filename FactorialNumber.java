//Recursive Program to find factorial number of a given input (Positive Integer) using keyboard 

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		FactorialNumber ob1 = new FactorialNumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter (Fn): "); // Enter Fn value that you need to find
		int fNumber = sc.nextInt();

		int factorialNumber = ob1.findFactorial(fNumber); // Fn'th factorial number
		System.out.println(fNumber + "th triangular number is " + factorialNumber);

	}

	// calculate factorial number using recursive function
	public int findFactorial(int number) {

		if(number==0) {
			return 1;
		}

		return number * findFactorial(number-1); // recursion
	}

}
