package week3.day2;

public class PolyMorphisn {

	public void reportStep(String message,String status)
	{
		System.out.println("Function with two arguments");
		System.out.println(message);
		System.out.println(status);
	}
	public void reportStep(String message,String status,boolean snap)
	{
		System.out.println("Function with three arguments");
		System.out.println(message);
		System.out.println(status);
		System.out.println(snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyMorphisn poly=new PolyMorphisn();
		poly.reportStep("Hello", "Completed");
		poly.reportStep("Hello", "Completed",true);
	}

}
