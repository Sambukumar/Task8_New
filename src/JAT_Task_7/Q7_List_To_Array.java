package JAT_Task_7;

import java.util.LinkedList;
import java.util.List;

public class Q7_List_To_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		int arr[]=new int[list.size()];
		
		for (int i = 0; i < list.size(); i++)
		{
            arr[i] = list.get(i);
		}
		
		
		for (int x : arr)
		{
            System.out.println(x + " ");
		}

	}

}
