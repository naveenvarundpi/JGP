package week3.day1;

public class Reverse_Odd_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for(int i=0;i<split.length;i++)
		{
			if((i+1)%2==0)
			{
				char[] charArray = split[i].toCharArray();
				char[] charArray2= split[i].toCharArray();
				int j=charArray.length;
				for(int k=0;k<charArray.length;k++)
				{
					charArray2[j-1]=charArray[k];
					j--;

				}
				String temp1=new String(charArray2);
				split[i]=temp1;
			}

			System.out.println(split[i]);
		}



	}

}
