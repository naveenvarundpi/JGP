package src.test.java.practise;

public class SortedSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-4,1,0,3,10};
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=nums[i]*nums[i];
		}
		int temp=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for(int temp1:nums)
		{
			System.out.println(temp1);
		}
	}

}
