package recursionpack;

import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {

		FibonacciNumbers ob1 = new FibonacciNumbers();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter (FiboN): "); // Enter FiboN value that you need to find
		int fNumber = scan.nextInt();

		int FibonacciNum = ob1.findFibo(fNumber); // Tn'th Fibonacci number
		System.out.println(fNumber + "th Fibonnacci number is " + FibonacciNum);

	}

	// calculate Fibonacci number using recursive function
	public int findFibo(int number) {

		if(number<2) {
			return number;
		}
		
		return findFibo(number-1) + findFibo(number-2); // recursion
	}

}
