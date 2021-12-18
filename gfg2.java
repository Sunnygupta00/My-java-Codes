
public class gfg2 {
	static boolean opposite(int x,int y)
	{
		int a= Math.abs(x);
		int b=Math.abs(y);
		if(a==b) 
		{
			return true;
		}
		else 
			return false;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;int y=-200;
		System.out.println(opposite(x,y));

	}

}
