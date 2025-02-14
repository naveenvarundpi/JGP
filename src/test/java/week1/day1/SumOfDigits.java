package src.test.java.week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9910;
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			sum=sum+temp%10;
			temp=temp/10;
		}
		System.out.println("Sum of digits of the number "+num+" is: "+sum);
	}

}
