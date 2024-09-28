package Task_11_Java;

public class Q5_ArrayIndex_And_StringIndexExp {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};

        try {
            // Attempt to access an invalid index of the array
            System.out.println("Accessing array index 5: " + numbers[5]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Example of StringIndexOutOfBoundsException
        String text = "Hello";

        try {
            // Attempt to access an invalid index of the string
            char c = text.charAt(10); // This will throw an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }

	}

}
