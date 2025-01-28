package week3.day1;

import java.util.Arrays;

public class ArraysLearn {
	public static void main(String[] args) {
		int num[]= {2,5,7,7,5,9,2,3};
		int length = num.length;
		System.out.println("Using Nested for loop");
		int k=0;
		int temp=0;
		for(int i=0;i<num.length;i++)
		{
			temp=0;
			k=0;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					//System.out.println(num[i]);
					/*
					 * temp=num[i]; k++;
					 */
				}
				
			}
		}
		System.out.println("Using Array Sort");
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}
	}
}
