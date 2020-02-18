class Ramji
{
	int a=10,b=10;
	void Chant()
	{
		
		System.out.println(a+b);
	}
}
class Hamumanji extends Ramji
{
	
		void Chant2()
		{
			System.out.println("Jai RAm JI!");
		}
		public static void main(String...ru)                            //Single Inheritance
	{
	    Hamumanji H1 = new Hamumanji();
		H1.Chant();
		H1.Chant2();
	}
}


//it shows relationship b/w Ramji and Hamnumanji there is IS-A Inheritance;