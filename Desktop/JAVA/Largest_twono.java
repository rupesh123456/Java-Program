import java.util.*;
class Largest_Twono
{
	public static void main(String...ru)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b= sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			System.out.println(" A is greter out of all = " +a);
		}
		else if(b>c)
		{
			System.out.println(" B is greter out of all = " +a);
		}
		else{
			System.out.println(" C is greter out of all = " +c);
		}
	}
}