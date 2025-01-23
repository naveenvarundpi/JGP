package week3.day2;

public class LoginTestData extends TestData{
	public void enterUsername() 
	{
		System.out.println("enterUsername");
	}
	public void enterPassword()
	{
		System.out.println("enterPassword");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterPassword();
		ltd.enterPassword();
	}

}
