package src.test.java.practise;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2,2,1};
		int nums2[]= {2,2};
		int x[]=new int[5];
		int k=0;
		for(int i=0;i<nums1.length;i++)
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j])
				{
					x[k]=nums1[i];
					k++;
				}
			}
			
		}
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		
		
	}

}
