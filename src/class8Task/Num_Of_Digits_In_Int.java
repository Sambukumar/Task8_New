package class8Task;

import java.util.Scanner;

public class Num_Of_Digits_In_Int {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to calculate digit");
		Scanner s= new Scanner(System.in);
		long num = s.nextLong();
		s.close();
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The number of digits is "+ count);
	}

}
