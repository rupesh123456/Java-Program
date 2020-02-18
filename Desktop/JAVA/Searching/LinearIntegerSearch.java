class LinearIntegerSearch
{
	public static void main(String...ru)
	{
		int a[]={10,20,30,40};
		int item=50;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("Item Present At = " + i  + "  index");
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Element Not Found");
		}
	}
}