package src.test.java.week3.day2;

public class SubClass extends SuperClass{
	public void takeSnap()
	{
		System.out.println("Inside Sub Class and takesnap method");
	}
	
	public void reportStep()
	{
		System.out.println("Inside Sub Class and reportStep method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass cla=new SubClass();
		cla.reportStep();
		cla.takeSnap();
		SuperClass sup=new SuperClass();
		sup.reportStep();
		sup.takeSnap();
		

	}

}
