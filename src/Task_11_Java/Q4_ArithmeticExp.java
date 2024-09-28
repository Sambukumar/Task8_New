package Task_11_Java;


import java.util.Scanner;

public class Q4_ArithmeticExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = s.nextInt();
            System.out.print("Enter the denominator: ");
            int denominator = s.nextInt();

			// Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Cannot divide by zero. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception cought "+ e.getMessage());
        }
        s.close();

	}

}
