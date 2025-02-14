package Assigments.week3.day2;

public class LoginPage extends BasePage{
	public void findElement()
	{
		System.out.println("findElement in subclass");
	}
	public void clickElement()
	{
		System.out.println("clickElement in sub class");
	}
	public void enterText()
	{
		System.out.println("enterText in sub class");
	}
	public void performCommonTasks()
	{
		System.out.println("performCommonTasks in sub class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage page=new LoginPage();
		page.findElement();
		page.clickElement();
		page.enterText();
		page.performCommonTasks();
		BasePage bpage=new BasePage();
		bpage.findElement();
		bpage.clickElement();
		bpage.enterText();
		bpage.performCommonTasks();
	}

}
