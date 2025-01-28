package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args)
	{
		String[] cname={"HCL","Wipro","Aspire Systems","CTS"};
		List<String> cnamel=new ArrayList<String>();
		for(int i=0;i<cname.length;i++)
		{
			cnamel.add(cname[i]);
		}
		Collections.sort(cnamel);
		for(int i=cnamel.size()-1;i>=0;i--)
		{
			System.out.println(cnamel.get(i));
		}
	}
}
