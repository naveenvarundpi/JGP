package src.test.java.practise;

public class MyUnderstanding {

	public static void main(String[] args)
	{
		String name="Naveen";
		char[] ch=name.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
		for(int j=0;j<len;j++)
		{
			if(j>=i)
			{
			System.out.print(ch[j]);
			}
			else
			{
			System.out.print(" ");
			}
		}	
		System.out.println();
		}




	}
}
