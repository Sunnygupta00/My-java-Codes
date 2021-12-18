
public class countingn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,2,2,3,3};
		int ones = 0,twos=0;
		for (int x:arr)
		{
			ones=(x^ones)&(~twos); 
		    twos=(x^twos)&(~ones);
			
		}

		System.out.println(twos);		System.out.println(ones);
//		ones=(x^ones)&(~twos); 
//	    twos=(x^twos)&(~ones);
	}

}
