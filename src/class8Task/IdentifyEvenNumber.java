package class8Task;

import java.util.Scanner;

public class IdentifyEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number to check it is even or not");
		num= s.nextInt();
		s.close();
		if(num%2==0)
		{
			System.out.println("The entered Value " + num +" is an even number");
		}
		else
		{
			System.out.println("The entered Value " + num +" is not an even number");
		}

	}

}
