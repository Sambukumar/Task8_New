package Task_11_Java;

import java.util.Scanner;


class Login extends Exception {
	// Constructor is created and value is taken in the variable 's'
	Login(String s) {
		// calling of parent constructor
		super(s);
	}
}

public class LoginClass {
	
	public static void main(String[] args) {
		// some default password is stred in 'pass' variable for validation
		String passLocal = "Password1234";
		Scanner scanner = new Scanner(System.in);
		// UserName got as input from user
		System.out.print("Enter username : ");
		String userName = scanner.nextLine();
		// Password got as input from user
		System.out.print("Enter password : ");
		String passWord = scanner.nextLine();
		// Used try catch method for user defined exception
		try {
			// if statement is used for validation whether
			//Checking the value of 'passLocal' and 'passWord' contains same value or not
			if (!passLocal.equals(passWord))
				// if condition is satisfied then error is thrown
				throw new Login("Entered password is incorrect");
			else
				System.out.println("Entered password is correct");
		} catch (Login e) {
			// Message is printed using getMessage() method
			System.out.println(e.getMessage());
		}

	}

}
