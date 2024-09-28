package JAT_Task_7;

import java.util.Map;
import java.util.TreeMap;

public class Q6_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tmapObj= new TreeMap<Integer, String>();
		tmapObj.put(1, "Sambu");
		tmapObj.put(3, "Kumar");
		tmapObj.put(2, "Raj");
		System.out.println(tmapObj);
		
		// sorting
		
		TreeMap< String, Integer> sortedByValueMap = new TreeMap<>();

        // Invert key-value pairs for sorting by value
		//We are doing this because Treemap is sorted by default with ID
        for (Map.Entry<Integer, String> entry : tmapObj.entrySet()) {
            sortedByValueMap.put(  entry.getValue(), entry.getKey());
            
        }
        
        System.out.println(sortedByValueMap);
        //Printing the names as per ascending order
        for (Map.Entry<String, Integer> entry : sortedByValueMap.entrySet()) {
            System.out.println(   entry.getKey() );
        }

	}

}
