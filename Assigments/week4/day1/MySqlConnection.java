package Assigments.week4.day1;

public abstract class MySqlConnection implements DatabseConnection{
	
	public void executeQuery()
	{
		System.out.println("executeQuery");
	}
	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}


}
