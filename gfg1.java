
public class gfg1 {
	static int ones(int []arr, int l)
	{
		int ones=0;int twos=0;
		for(int ans:arr)
		{
			ones=(ones^ans)&(~twos);
			twos=(twos^ans)&(~ones);
		}
		return ones;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tese gfg=new tese();
	int arr[]=	 {12, 1, 12, 3, 12, 1, 1, 5, 3, 3} ;
	int l=arr.length;
	System.out.println(gfg.unique(arr,l,3));
	System.out.println(ones(arr,l));
	}
//      ones=(ones^arr)&(~two)
//      two=(twos^arr)&(~ones)
}
