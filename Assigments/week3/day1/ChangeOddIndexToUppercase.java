package Assigments.week3.day1;
public class ChangeOddIndexToUppercase {
public static void main(String[] args) {
	
	String name="changeme";
	int len=name.length();
	char[] charArray = name.toCharArray();
	for(int i=0;i<len;i++)
	{
		if(i%2!=0)
		{
			charArray[i]=Character.toUpperCase(charArray[i]);
			
		}
	}
	for(char ch:charArray)
	{
		System.out.print(ch);
	}
	
}
}
