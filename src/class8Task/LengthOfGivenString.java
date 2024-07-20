package class8Task;

import java.util.Scanner;

public class LengthOfGivenString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string to check the length ");
		
		String str= s.nextLine();
		s.close();
		
		System.out.println("The length of given string is " + str.length());//Using string length functionality
		
		
		int  count = 0;
		 
        // Use a while loop to iterate through the characters until the end of the string
        for (int i=0;i < str.length();i++) 
        {
        	count++;
        }
 
        // Print the length of the string
        System.out.println("The length of given string is " +count);//Using for loop
		
	}

}
