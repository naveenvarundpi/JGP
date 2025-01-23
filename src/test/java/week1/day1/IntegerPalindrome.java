package week1.day1;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=363;
		int val=num;
		int temp=0;
		while(num>0)
			/*
			 * { temp=(temp*10)+(num%10); num=num/10; } num=val;
			 */
		for(int i=0;num>0;i++)
		{
			temp=(temp*10)+(num%10);
			num=num/10;
		}
		
		if(temp==val)
		{
			System.out.println(val+ " is a palindrome number ");
		}
		else
		{
			System.out.println(val+ " is not a palindrome number ");
		}
		
	}

}
