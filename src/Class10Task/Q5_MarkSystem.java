package Class10Task;

import java.util.Scanner;
//Using IF else. Achieved using swithch too Pasted that below this code
public class Q5_MarkSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the mark to valuate the grade : ");
		int mark = scanner.nextInt();
		
		
		
		if(mark==100)
		{
			System.out.println("Grade is S");
		}
		
		else if(mark<100 && mark>=90)
		{
			System.out.println("Grade is A");
		}
		
		else if(mark<90 && mark>=80)
		{
			System.out.println("Grade is B");
		}
		else if(mark<80 && mark>=70)
		{
			System.out.println("Grade is C");
		}
		
		else if(mark<70 && mark>=60)
		{
			System.out.println("Grade is D");
		}
		else if(mark<60 && mark>=50)
		{
			System.out.println("Grade is E");
		}
		
		else if(mark<50 && mark>=0)
		{
			System.out.println("Grade is F");
		}
		else
		{
			System.out.println("Invalid input (Note: Enter the value from 1 to 100)");
		}

	}

}

//Using Switch
/*
package testProject;

import java.util.Scanner;

public class GradeSystemUsing_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the mark to valuate the grade : ");
		int mark = scanner.nextInt();

		if (mark < 0 || mark > 100) {
			System.out.println("Invalid score! Score should be between 0 and 100.");
		}

		else {
			int category = mark / 10;
			// Handle grades using a switch statement
			switch (category) {
			case 10:
				// Case for marks 100				
					System.out.println("Grade: S");
				break;
			case 9:
				// Case for marks 90-99
				System.out.println("Grade: A");
				break;
			case 8:
				// Case for marks 80-89
				System.out.println("Grade: B");
				break;
			case 7:
				// Case for marks 70-79
				System.out.println("Grade: C");
				break;
			case 6:
				// Case for marks 60-69
				System.out.println("Grade: D");
				break;
			case 5:
				// Case for marks 50-59
				System.out.println("Grade: E");
				break;
			default:
				// Case for marks below 50
				System.out.println("Grade: F");
				break;
			}
		}
	}

}
*/