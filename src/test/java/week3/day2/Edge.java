package src.test.java.week3.day2;

public class Edge extends Browser{
	public void takeSnap()
	{
		System.out.println("takeSnap");	
	}
	public void clearCookies()
	{
		System.out.println("clearCookies");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge eg=new Edge();
		eg.browserName="Edge";
		eg.browserVersion=6;
		eg.clearCookies();
		eg.closeBrowser();
		eg.takeSnap();
		eg.navigateBack();
		eg.openURL();
	}

}
