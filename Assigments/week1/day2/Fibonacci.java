package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		for(int i=0;i<range-1;i++)
		{
			sum=a+b;
			System.out.println(sum);
			//0, 1, 1, 2, 3, 5, 8
			b=a;
			a=sum;
		}

	}

}
