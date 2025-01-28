package week3.day2;

public class CheckBoxButton extends Button{

	public void clickCheckButton()
	{
		System.out.println("clickCheckButton");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton cbb=new CheckBoxButton();
		cbb.clickCheckButton();
		cbb.submit();
		cbb.click();
		cbb.setText("check");

	}

}
