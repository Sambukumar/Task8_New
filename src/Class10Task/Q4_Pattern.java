package Class10Task;

import java.util.Scanner;

public class Q4_Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows of * to be printed in the X format: ");
		int n = scanner.nextInt();
		// Loop to print each row
		for (int i = 0; i < n; i++) {
			// Loop to print each column
			for (int j = 0; j < n; j++) {
				// Print '*' in the appropriate positions
				if (j == i || j == n-i-1) {
					//Here (j == n-i-1) places * on the diagonal from top right to bottom left
					//And j == i places * on the diagonal from top left to bottom right
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}
			}
			// Move to the next line after printing a row
			System.out.println();
		}
	}
}
