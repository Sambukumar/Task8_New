package class8Task;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int i,flag=0;  
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value to check it is prime number or not ");
		
		int num= s.nextInt();
		s.close();
		     
		         
		  if(num==0||num==1)
		  {  
		   System.out.println(num+" is not prime number");      
		  }
		  else if(num==2||num==3)
		  {
			  System.out.println(num+" is prime number");   
		  }
		  else
		  {  
		   for(i=2;i<=(num/2);i++)
		   {      
		    if(num%i==0)
		    {      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  
		   { 
			   System.out.println(num+" is prime number"); 
		   }  
		  } 

	}

}
