package Assigments.week3.day1;

public class Remove_Duplicate_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		String replace=null;
		for(int i=0;i<split.length;i++)
		{

			for(int j=i+1;j<split.length;j++)
			{

				if(split[i].equalsIgnoreCase(split[j]))
				{
					replace=split[i];
					break;
				}
			}

		}
		String replace2 = text.replace(replace, "");
		System.out.println(replace2);
	}

}
