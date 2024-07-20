package class8Task;

import java.util.Scanner;

public class Class_8_Task1_IdentifiyingTheGreaterValueBySumOfa_b_and_c_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of a,b,c and d");
		
		a= s.nextInt();
		b=s.nextInt();
		c= s.nextInt();
		d=s.nextInt();
		
		s.close();
		
		if ((a+b)>(c+d))
		{
			System.out.println("The Sum of a and b is greater than Sum of c and d");
		}
		else
		{
			System.out.println("The Sum of c and d is greater than Sum of a and b");
		}
		

	}

}
