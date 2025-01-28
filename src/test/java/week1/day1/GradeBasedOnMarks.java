package week1.day1;

public class GradeBasedOnMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks=107;
		if(marks>100)
		{
			System.out.println("Invalid mark");
		}
		else if(marks>=90 && marks<=100)
		{
			System.out.println("Grade is A");
		}
		else if(marks>=80 && marks<89)
		{
			System.out.println("Grade is B");
		}
		else if(marks>=70 && marks<79)
		{
			System.out.println("Grade is C");
		}
		else if(marks>=60 && marks<69)
		{
			System.out.println("Grade is D");
		}
		else if(marks>=50 && marks<59)
		{
			System.out.println("Grade is E");
		}
		else
		{
			System.out.println("Grade is F");
		}
	}
	

}
