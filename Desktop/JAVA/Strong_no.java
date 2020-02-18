import java.util.Scanner;
class Strong
{
	public static void main(String...ru)
	{
		int n,r,sum=0,temp,fact;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number which you want to check");
		n= sc.nextInt();
        temp=n;
		while(n>0)
		{
          r=n%10;
          fact=1;
          
          for (int i=r;i>=1;i--)
           {
          	fact = fact*i;
          }
          sum=sum+fact;
          n=n/10;
		}
		n=temp;
		if(n==sum){
			System.out.println("This is Strong Number ="+n);
		}
		else
		{
			System.out.println("This is Not Strong Number ="+n);
		}

	}
}