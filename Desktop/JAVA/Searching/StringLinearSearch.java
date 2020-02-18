class StringLinearSearch
{
	public static void main(String...ru)
	{
		String s[]={"RAmji","HanumanJi","Mahadev","SarswatiMAta","LaxmiMAta","DurgaMata"};
		String item="SarswatiMAta";
		for (int i=0;i<s.length ;i++ ) {
			if(s[i].equals(item))
			{
				System.out.println("String Found at = " + i + "  index");
			}
		}
	}
}