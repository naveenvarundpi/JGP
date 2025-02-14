package Assigments.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String args[])
	{
		int[] array={1, 2, 3, 4, 10, 6, 8};
		List<Integer> num=new ArrayList<Integer>();
		List<Integer> missingNum=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			num.add(array[i]);
		}
		Collections.sort(num);
		int lastElement=num.get(num.size()-1);
		boolean flag=false;
		for(int i=1;i<=lastElement;i++)
		{
			for(int j=0;j<num.size();j++)
			{
				flag=false;
				int k=num.get(j);
				if(i==k)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				missingNum.add(i);
			}

		}
		System.out.println(missingNum);
	}

}


