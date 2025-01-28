package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		boolean comp=true;
		if(text1.length()==text2.length())
		{
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			for(int i=0;i<charArray.length;i++)
			{
				if(charArray[i]!=charArray2[i])
				{
					comp=false;
					break;
				}
			}
			if(comp==true)
			{
				System.out.println("Both the strings are Anagram");
			}
			else
			{
				System.out.println("Both the strings are not Anagram");
				
			}
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
