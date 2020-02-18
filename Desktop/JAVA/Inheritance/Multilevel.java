class Multi
{
	void level()
	{
		System.out.println("Multilevel Inheritance");
	}
}
class Multi2 extends Multi
{
	void level2()
	{
		System.out.println("Multilevel Inheritance");
	}
}
class Multi3 extends Multi2
{
	void level3()
	{
		System.out.println("Multilevel Inheritance");
	}
	public static void main(String...ru)
	{
	Multi3 M1 = new Multi3();
	M1.level();
	M1.level2();
	M1.level3();
}}

//This is MultiLevel Inheritance;