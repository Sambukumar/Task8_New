package JAT_Task_7;

import java.util.ArrayList;

public class Q5_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();

        // Add some strings to the ArrayList
        stringList.add("Ram");
        stringList.add("Sam");
        stringList.add("Hari");
        stringList.add("Ammu");

        // Print the contents of the ArrayList
        System.out.println("ArrayList before removing elements: " + stringList);

        // Remove all elements from the ArrayList
        stringList.clear();

        // Print the contents of the ArrayList after removal
        System.out.println("ArrayList after removing elements: " + stringList);

	}

}
