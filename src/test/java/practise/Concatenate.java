package practise;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,1};
		int size=num.length;
		int ans[]=new int[2*size];
		int ansl=ans.length;
		for(int i=0;i<num.length;i++)
		{
			ans[i]=num[i];
			ans[i+(ansl/2)]=num[i];
			
		}
	for(int k:ans)
	{
		System.out.println(k);
	}
	}

}
