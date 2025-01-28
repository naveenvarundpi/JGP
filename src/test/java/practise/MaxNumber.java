package practise;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {2,1,8,11,3};
		int temp=0;
		for(int i=0;i<num.length;i++)
		
		{
			for(int j=i;j<num.length;j++) {
			if(num[i]>num[j])
			{
			temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			}
			}
		}
	System.out.println("Max num in the array: "+num[num.length-1]);
	System.out.println("Min num in the array: "+num[0]);
	}
	
}
