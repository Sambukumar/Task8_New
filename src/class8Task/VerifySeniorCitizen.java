package class8Task;

import java.util.Scanner;

public class VerifySeniorCitizen {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the age to check that the given age falls under Senior Citizen category or not");
		
		int age= s.nextInt();
		s.close();
		
		if (age>=60)
		{
			System.out.println("The entered age falls under Senior Citizen category");
			
		}
		else
		{
			System.out.println("The entered age does not falls under Senior Citizen category");
		}

	}

}
