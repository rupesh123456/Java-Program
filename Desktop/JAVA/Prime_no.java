import java.util.*;
class Prime
{
	public static void main(String...ru)
	{
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}

		}
		if(count==2)
		{
			System.out.println("prime no = " +n);

		}
		else
		{
			System.out.println("Not prime no = " +n);
		}

	}
}