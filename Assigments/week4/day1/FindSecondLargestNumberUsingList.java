package Assigments.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*- Declare an array {3, 2, 11, 4, 6, 7}.
		  - Pick the 2nd element from the last and print it. */
		int[] array={3, 2, 11, 4, 6, 7};
		List<Integer> array1=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			array1.add(array[i]);
		}
		Collections.sort(array1);
		System.out.println("Second Largest Number: "+array1.get(1) );
	
	}

}
