package src.test.java.practise;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[]= {3,2,1,4,6,7,0};
		int num[]= {2,1,0,4,6,5};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=i)
			{
				System.out.println("Missing element: "+i);
				break;
			}
		}
	}

}
