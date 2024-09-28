package Class10Task;

import java.util.Scanner;

public class Q7_LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of C: ");
        int c = scanner.nextInt();
        
        if(a>b && a>c )
        {
        	System.out.println("The greatest of 3 values is A " + a);
        }
        
        else if(b>a && b>c )
        {
        	System.out.println("The greatest of 3 values is B " + b);
        }
        else
        {
        	System.out.println("The greatest of 3 values is C " + c);
        }

	}

}
