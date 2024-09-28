package Task_11_Java;

import java.util.Scanner;

public class Q7_CustomExp {
	
	static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
        	if(age>0 && age<130)
        	{
        		checkAge(age);
        	}
        	else {
        		System.out.println("Enter valid age");
        	}
        } catch (InvalidAgeException e) {
            System.out.println("Caught an InvalidAgeException: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to check the age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 year or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

}
