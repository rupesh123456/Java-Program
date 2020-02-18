import java.util.*;
interface colors
{
	void setColor(String color);
	String getColor();
}
class Sqaure implements colors
{

	 void setSide(double side)
	 {
	 	System.out.println(side*side);
	 }
	 double getside();
	 double getArea();
}
class Test
{
	double s;
	String c;
	colors C1=new colors();
	Sqaure obj =new Sqaure();
	Scanner Sc= new Scanner(System.in);
	c=sc.next();
	s=Sc.nextDouble();
     C1.setColor(c);
	obj.setSide(s);
}