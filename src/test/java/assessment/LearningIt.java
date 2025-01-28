package assessment;

public class LearningIt {
	public static void main(String[] args) {

//		String str="ab-cd";
		String new1=new String();
		String str="Testleaf-Software=Great-value!";
		char[] charArray = str.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			//System.out.print(charArray[i]);
			new1=new1+charArray[i];
		}
		System.out.println(new1);
		str="testleaf";
		char ch='t';
		char[] charArray2 = str.toCharArray();
		String new2=new String();
		for(int i=0;i<charArray2.length;i++)
		{
			if(charArray2[i]!=ch)
			{
				new2=new2+charArray2[i];
			}
			
		}
		System.out.println(new2);
		str="Hello Testleaf,you are awesome!";
		String replaceAll = str.replaceAll(","," ");
		System.out.println(replaceAll);
		String[] split = replaceAll.split(" ");
		System.out.println(split.length);
		str="";
		String lowerCase = str.toLowerCase();
		String replace = lowerCase.replaceAll("[^A-za-z0-9]"," ");
		System.out.println(replace);
		String replace2 = replace.replace(" ","");
		System.out.println(replace2);
		boolean comp=false;
		int k=replace2.length();
		k=k-1;
		if(replace2.equals(""))
		{
			comp=true;
		}
		else {
		for (int i = 0; i < replace2.length(); i++)
		{
			if(replace2.charAt(i)==replace2.charAt(k))
			{
				comp=true;
				k--;
			}
			else
			{
				comp=false;
				break;
			}
			
		}
		System.out.println(comp);
		
		
	}
	}

}
