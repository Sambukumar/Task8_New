package class8Task;

import java.util.Scanner;

public class Factorial_Prgm {
	
	public static void factorial(int n)
	{
		long factorialNum=1;
		if(n>2)
		{
			while(n!=0)
			{
				factorialNum=factorialNum *(n);
				n--;
				
			}
			System.out.println("The factorial of given num is "+ factorialNum);
		}
		else
		{
			System.out.println("The factorial of given num is 1");
		}
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value to the factorial ");
		
		int num= s.nextInt();
		
		factorial(num);
		s.close();

	}

}
