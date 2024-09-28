package Class10Task;

import java.util.Scanner;

public class Q1_Str_Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string value to check for the palindrome validation");
		Scanner s= new Scanner(System.in);
		String str = s.nextLine(); 
		str =str.replaceAll("\\s", "").toLowerCase();//this removes the space in the given string and converts to lower case
        System.out.println(str);
        isPalindrome(str);
        s.close();

	}
	public static void isPalindrome(String str)
    {
        
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            
            System.out.println("given string "+ str +" is palindrome ");
        }
        else {
        	System.out.println("given string "+ str +" is not a palindrome ");
        }
       
    }

}
