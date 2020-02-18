import java.util.Scanner;
 
abstract class Shape {
    abstract void area(double b);
    
}
 
class Square extends Shape{
     private double side;
    void area(double side)
    {
        System.out.println("Area of Square: "+side*side);
    }
   
}
         
class Test {
    public static void main(String...ru)
    {
        double  s;
         Square a= new Square();
        Scanner get = new Scanner(System.in);
        System.out.print("\nEnter Side of a Square: ");
        s = get.nextDouble();
        a.area(s);
        
 
    
    }
} 