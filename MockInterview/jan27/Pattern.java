package jan27;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="NAVEEN";
		char[] chart = name.toCharArray();
		/*
		 * 
		 * 
		 * for(int i=0;i<chart.length;i++) { for(int j=0;j<=i;j++) {
		 * System.out.print(chart[j]); } System.out.println(); }
		 */
		
		
		for(int i=chart.length-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
			if(j==i)
			{
			for(int k=j;k<=chart.length-1 ;k++)
			{
				System.out.print(chart[k]);
			}
			
			
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
