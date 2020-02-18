import java.io.*;
class StringcBuffer
{
	public static void main(String...ru)
	{
    
 StringBuffer sb = new StringBuffer("Hello");
  int b=sb.length();    //it gives length of string
  int c = sb.capacity(); // it gives length+16
  System.out.println(b);
  System.out.println(c);
  System.out.println(sb.append(" Jai shree RAm!")); //can add String in existing String
  System.out.println(sb.insert(3,""));       //can specify where we have insert string
  System.out.println(sb.reverse());   //it will reverse the string
  System.out.println(sb.deleteCharAt(3));
  System.out.println(sb.replace(3,8, " Mahadev"));
  System.out.println(sb.delete(5,8));

	}
}

//This is All About StrinBuffer;