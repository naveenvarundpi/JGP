package jan27;

public class Grade {
	public void grades(int mark)  
	{
	{
	if(mark>100)
	{
	System.out.println("Invalid mark");
	}
	else if(mark>90 && mark<100 )
	{
	System.out.println("Grade is: A+");
	}
	else if (mark>80 && mark<89)
	{
	System.out.println("Grade is: A");
	}
	else if (mark>70 && mark<79)
	{
	System.out.println("Grade is: B+");
	}
	else if (mark>60 && mark<69)
	{
	System.out.println("Grade is: B");
	}
	else if(mark<60)
	{
	System.out.println("Grade is: F");
	}
	}
	}
	public static void main(String[] args) {
		
int marks=25;
Grade grd=new Grade();
grd.grades(marks);
	}

}
