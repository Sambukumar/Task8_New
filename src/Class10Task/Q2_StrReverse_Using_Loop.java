package Class10Task;

import java.util.Scanner;

public class Q2_StrReverse_Using_Loop {
	 public static void main(String[] args) {  
	        
		 	System.out.println("Enter the string to be reversed");
			Scanner s= new Scanner(System.in);
		 	String inputString = s.nextLine();
		 	String reverse= reverse(inputString);  
	        System.out.println("Original String is " + inputString);  
	        System.out.println("Reversed String is " + reverse);  
	        s.close();
	    } 
	 public static String reverse(String str) {
		
		 String reversedString = "";  
	        // Iterate through each character in the input string starting from the last character  
	        for (int i = str.length() - 1; i >= 0; i--) {  
	            reversedString += str.charAt(i);  // Concatenate each character to the reversed string  
	        } 
		 
		 return reversedString;
		 
	 }
	 

}
