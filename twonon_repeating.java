
public class twonon_repeating {
static void Two(int arr[],int length) {
	int store1=0;
	for(int i=0;i<length;i++)
	{
		store1^=arr[i];
	}
	store1=store1 & (-store1);
	int first=0;
	int second=0;
	for(int i=0;i<length;i++)
	{
		if((arr[i]&store1)==0)
		{
			first^=arr[i];
		}
		else
		{
			second ^=arr[i];
		}
	}
	System.out.println("Two non reapeating no is "+first+" and "+second);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={2, 3, 7, 9, 11, 2, 3, 11};
		int length=arr.length;
		Two(arr,length);
		
	}

}
