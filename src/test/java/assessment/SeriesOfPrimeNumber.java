package assessment;

public class SeriesOfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int range=19;
		 int num=0;
		 boolean val=false;
		 for(int i=2;i<=range;i++)
		 {
			 if(i!=2)
			 {
			 for(int j=2;j<i;++j)
			 {
				 
				 {
				 if(i%j!=0)
				 {
					 val=true;
					 num=i;
				 }
				 else
				 {
					 val=false;
					 break;
				 }
			 }
			 }
			 }
			 else
			 {
				 val=true;
				 num=i;
			 }
			 if(val)
			 {
				 System.out.println(num+" is a prime number");
			 }
			 
			 
		 }


	

}
}
