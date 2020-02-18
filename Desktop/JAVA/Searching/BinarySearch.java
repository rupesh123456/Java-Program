class BinarySerch
{
	public static void main(String...ru)
	{
		int a[]={10,20,30,40};
		int h=a.length-1;
		int l=0;
		int item=20;
		int m=(l+h)/2;
		while(l<=h)
		{
			if(a[m]==item)
			{
				System.out.println("Element present  at = " + m);
				break;	 
			}
			else if(item>a[m])
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
			m=(l+h)/2;
		}
		if(l>h)
		{
			System.out.println("Element not found");
		}
	}
}