package practise;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,5};
		int target=9;
		int[] num=new int[2];
  		for(int i=0;i<nums.length;i++)
        {
        	for(int j=i;j<nums.length;j++)
            {
            if(target==nums[i]+nums[j])
            {
            num[0]=nums[i];
              num[1]=nums[j];
              break;
            }
            }
        	
        }
  		System.out.println(num[0]);
    	System.out.println(num[1]);
	}

}
