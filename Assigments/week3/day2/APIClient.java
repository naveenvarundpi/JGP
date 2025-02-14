package Assigments.week3.day2;

public class APIClient {

	public void sendRequest(String endPoint)
	{
		System.out.println("Entered single argument send request method");
		System.out.println("Send Request completed with end point: "+endPoint);
	}
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus)
	{
		System.out.println();
		System.out.println("Entered triple argument send request method");
		System.out.println("Send Request completed with end point: "+endPoint);
		System.out.println("Send Request completed with requestbody: "+requestBody);
		System.out.println("Send Request completed with requeststatus: "+requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api=new APIClient();
		api.sendRequest("https://testleaf.com/maps/api/place/delete/json?key=qaclick123");
		api.sendRequest("https://testleaf.com/maps/api/place/delete/json?key=qaclick1234", "/maps/api/place/delete/json", true);
	}

}
