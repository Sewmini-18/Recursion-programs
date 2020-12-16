//Recursive Program to find triangular number of a given input using keyboard 

import java.util.Scanner;

public class TriangularNumber {

	public static void main(String[] args) {

		TriangularNumber ob1 = new TriangularNumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter (Tn): "); // Enter Tn value that you need to find
		int tNumber = sc.nextInt();

		int triangularNumber = ob1.findTriangular(tNumber); // Tn'th triangular number
		System.out.println(tNumber + "th triangular number is " + triangularNumber);

	}

	// calculate triangular number using recursive function
	public int findTriangular(int number) {

		if (number == 1) {
			return number;
		} else if (number <= 0) {
			return 0;
		}
		return number + findTriangular(number - 1); // recursion
	}

}
