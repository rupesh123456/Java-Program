import java.util.*;
class UserInputLinearSearch
{
	public static void main(String...ru)
	{
		int temp=0;
		int i;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter A length of Array  = " + n);
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		int key=sc.nextInt();
		System.out.println("Enter a Element which want to search = "+key);
		for (i=0;i<n ;i++ ) {
			if(a[i]==key)
			{
				System.out.println("Element Present at  = "+(i+1));
				temp=temp+1;			}

		}
		if(temp==0)
		{
			System.out.println("Element Doesn't Exist =  " + key);
		}
		
	}
}