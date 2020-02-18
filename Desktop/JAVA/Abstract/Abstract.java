abstract class Vehicle
{
	int a;
	abstract void start();
}
class Car extends Vehicle
{
	void start(){
		
		System.out.println("Jai shree Ram!");
	}
	public static void main(String...ru)
	{
     Car c1=new Car();
     c1.start(10,20);
	}
}

