package week4.day1;

public class Concrete implements DatabseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete c=new Concrete();
		c.connect();
		c.disconnect();
		c.executeUpdate();

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
