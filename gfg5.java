
public class gfg5 {
  static int turnoff(int x)
   {
	return x&x-1;
    }
    static int poweroff(int x)
  {
	if(x==0)
	{
		return 0;
	}
while(x!=1) {
	if(x%4!=0) {	return 0;}
	
		x=x/4;
	}
	return 1;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(turnoff(10));
poweroff(4);
System.out.println(6%4);
if(poweroff(64)==1)
{
	System.out.println("this is power of 4");
}
else 
{
	System.out.println("mo");
}
	}

}
// turn off  right most bit
