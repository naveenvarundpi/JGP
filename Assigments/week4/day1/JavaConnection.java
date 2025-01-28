package week4.day1;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();

	}

}
