package week4.day1;

public abstract class CanaraBank implements Payments{

	public void cashOnDelivery()
	{
		System.out.println("Cash on Delivery");
	}
	public void upiPayments()
	{
		System.out.println("upiPayments");
	}
	public void cardPayments()
	{
		System.out.println("cardPayments");
	}
	public void internetBanking()
	{
		System.out.println("internetBanking");
	}
	public void recordPaymentDetails()
	{
		System.out.println("recordPaymentDetails");
	}
}
