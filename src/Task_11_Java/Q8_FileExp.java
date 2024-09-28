package Task_11_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q8_FileExp {
	public static void main(String[] args) {
        
        String fileName = "nonexistentfile.txt";//Dummy file name
        
        File file = new File(fileName);//Creating the file obj

        try {
            // Attempt to read the file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException
            System.out.println("Caught a FileNotFoundException: " + e.getMessage() + " which means "+ e.getLocalizedMessage());
        }
    }

}
