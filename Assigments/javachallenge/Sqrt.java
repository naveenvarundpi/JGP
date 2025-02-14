package Assigments.javachallenge;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=2;
		double z=0;
		double y;
		if(x<2)
		{
			System.out.println(x);
		}
		else {
		y = x;
		z = (y + (x / y)) / 2;
		//System.out.println(z);
		while(y-z>=0.00001)
		{
			y=z;
			z = (y + (x / y)) / 2;
			
		}
		System.out.println(z);
		}
		
	}

}
