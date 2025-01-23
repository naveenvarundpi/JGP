package week3.day2;

public class Safari extends Browser {
	public void readerMode() 
	{
	System.out.println("readerMode");
	}
	public void  fullScreenMode()
	{
		System.out.println("fullScreenMode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari sa=new Safari();
		sa.browserName="Safari";
		sa.browserVersion=9;
		sa.readerMode();
		sa.fullScreenMode();
		sa.openURL();
		sa.closeBrowser();
		sa.navigateBack();
	}

}
