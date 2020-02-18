class Overloading
{
	void show(int a,int b)
	{
		System.out.println("Sum Of a and b is ="+(a+b));
	}

	void show(String s1)
	{
         System.out.println("Har Har Mahadev");
	

	}


}
class Loading extends Overloading
{
	public static void main(String...ru)
	{
		Overloading o1= new Overloading();
		o1.show(10,20);
		o1.show("Rupesh");
	}
}

//This Concept is All about MethodOverLoading.