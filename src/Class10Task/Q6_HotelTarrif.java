package Class10Task;

import java.util.Scanner;

public class Q6_HotelTarrif {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = scanner.nextInt();
        int count=0;  
        while((month>=13 || month<=0)&& (count<3))
        {
        	
        	
        		System.out.print("Enter the proper value for month: ");
            	month = scanner.nextInt();
        		
        	
        	count++;        	
        	
        	
        }
        
        if(count>=3)
        {
        	System.out.println("Limit exceeded");
        	
        }
        else {
        	System.out.print("Enter the room rent per day: ");
            double roomRent = scanner.nextDouble();

            System.out.print("Enter the number of days stayed: ");
            int daysStayed = scanner.nextInt();

            double tariff = roomRent * daysStayed;

            switch (month) {
                case 4:
                	 // Increase room rent by 20% during peak seasons
                	tarrifCalculator(tariff);
                    break;
                case 5:
                	tarrifCalculator(tariff); // Increase room rent by 20% during peak seasons
                    break;
                case 6:
                	tarrifCalculator(tariff); // Increase room rent by 20% during peak seasons
                    break;
                case 11:
                	tarrifCalculator(tariff);; // Increase room rent by 20% during peak seasons
                    break;
                case 12:
                	tarrifCalculator(tariff); // Increase room rent by 20% during peak seasons
                    break;
                default:
                	System.out.printf("Hotel tariff is "+ tariff);
                	break;
            }
        }

        
	}
	
	public static void tarrifCalculator(double tariff) {
		tariff *= 1.2;
		System.out.println("Hotel Tarrif is "+ tariff);
	}
}
