package Assigments.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1={3, 2, 11, 4, 6, 7};
		int[] array2={1, 2, 8, 4, 9, 7};
		List<Integer> firstarray=new ArrayList<Integer>();
		List<Integer> secondarray=new ArrayList<Integer>();
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)
			{
				firstarray.add(array1[i]);
				secondarray.add(array2[i]);
			}
			
			
		}
		for(int i=0;i<firstarray.size();i++)
		{
			for(int j=0;j<secondarray.size();j++)
			{
				if(firstarray.get(i)==secondarray.get(j))
				{
					System.out.println(firstarray.get(i));
				}
			}
		}
		
		/*
		 *  - Declare an array for {3, 2, 11, 4, 6, 7}
			- Declare another array for {1, 2, 8, 4, 9, 7}
			- Compare both the arrays
			- Print the values if they are equal
		 * 
		 * */
	}

}
