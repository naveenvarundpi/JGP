package week3.day2;

public class RadioButton extends Button{

	public void selectRadioButton()
	{
		System.out.println("selectRadioButton");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton but=new RadioButton();
		but.selectRadioButton();
		but.submit();
		but.click();
		but.setText("radio");
	}

}
