package src.test.java.week1.day1;

public class Divison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend=7;
		int divisor=0;
		int temp=0;
		if(dividend==0)
		{
			temp=dividend;
		}
		else if (divisor==0)
		{
			temp=dividend;
		}
		else if(dividend>0 && divisor>0) 
		{ 

			dividend=dividend-divisor;
			while(dividend>0)
			{
				temp=temp+1;
				dividend=dividend-divisor;
			}
		}
		else if (dividend<0 && divisor>0)
		{
			dividend=dividend+divisor;
			while(dividend<0)
			{
				temp=temp-1;
				dividend=dividend+divisor;
			}
		}
		else if (dividend>0 && divisor<0)
		{
			dividend=dividend-(-divisor);
			while(dividend>0)
			{
				temp=temp-1;
				dividend=dividend-(-divisor);
			}
		}
		else if (dividend<0 && divisor<0)
		{
			dividend=(-dividend)-(-divisor);
			while(dividend>0)
			{
				temp=temp+1;
				dividend=dividend-(-divisor);
			}
		}
		
			
		System.out.println(temp);


	}

}
