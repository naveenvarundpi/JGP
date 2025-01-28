package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=26;
		boolean flag=true;
		for(int i=2;i<prime;i++)
		{
			if(prime%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(prime+ " is a prime number");
		}
		else
		{
			System.out.println(prime+ " is not a prime number");
		}	
	}

}
