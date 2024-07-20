package class8Task;

import java.util.Scanner;

public class TwoValueSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of num1 ");
		
		num1= s.nextInt();
		System.out.println("Enter the value of num2 ");
		num2=s.nextInt();
		
		s.close();
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("The value of num1 is "+ num1+" The value of num2 is  " +num2);
		

	}

}
