
public class FINDSINGLE {

	static int findsingle(int arr[],int seize)
	{
		int result=0;
		for(int i=0;i<seize;i++)
		{
			result^=arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2, 3, 5, 4, 5, 3, 4};
		int n= arr.length;
		System.out.println("Element occurring once is " +
                findsingle(arr, n) + " ");
	}
	

}
