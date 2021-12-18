
public class tese {
	static int unique (int arr[],int l,int k)
	{
		byte bit =4;
		int totalbit=8*bit;
		int count[]=new int [totalbit];
		int result=0;
		for(int i=0;i<totalbit;i++)
		{
			for(int j=0;j<l;j++)
			{
			  if( (arr[j]&(1<<i))!=0)
			  {
				count[i]+=1;  
			  }
			}
		
		}
	
		for(int i=0;i<totalbit;i++)
		{
			result+=(count[i]%k)*(1<<i);
		}
	return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={6, 2, 5, 2, 2, 6, 6};
		int l=arr.length;
		int k=3;
		int ans=unique(arr,l,k);
		System.out.println(ans);
	}

}
