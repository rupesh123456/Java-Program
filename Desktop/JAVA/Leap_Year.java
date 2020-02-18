import java.util.*;
class LeapYear
{
	public static void main(String...ru)

	{
		int n; 
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if((n%400==0)||((n%4==0) && (n%100!=0)))
		{
			System.out.println(" This  Year is Leap Yaer = " +n);

		}
		else
		{
			System.out.println(" This Year is Not Leap Yaer = " +n);
			
		}

	}
}