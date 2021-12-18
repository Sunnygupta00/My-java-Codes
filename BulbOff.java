package sortingAlg;

public class BulbOff {
public static  int bulb(int n)
{
	int i=1;
	while(i<=n/i)
	{
		i++;
	}
	return i-1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(bulb(3));
	}

}
