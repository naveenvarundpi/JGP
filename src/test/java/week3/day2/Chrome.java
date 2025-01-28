package week3.day2;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("openIncognito");
	}

	public void clearCache()
	{
		System.out.println("clearCache");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome ch =new Chrome();
		ch.browserName="Chrome";
		ch.browserVersion=5;
		ch.clearCache();
		ch.closeBrowser();
		ch.navigateBack();
		ch.openIncognito();
		ch.openURL();
	}

}
