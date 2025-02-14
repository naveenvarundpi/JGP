package src.test.java.practise;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="testleaf";
		int count=0;
		char ch='e';
		int len=name.length();
		char[] charArray = new char[len];
		
		
		//char[] charArray = name.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(ch==charArray[i])
			{
				count++;
			}
			
			
		}
		int count1=0;
		for(int i=0;i<name.length();i++)
		{
			if(ch==name.charAt(i))
			{
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
