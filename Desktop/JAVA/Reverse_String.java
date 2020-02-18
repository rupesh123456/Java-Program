import java.util.*;
class Revesre_String
{
	public static void main(String...ru)
	{
	String s;
	Scanner sc = new Scanner(System.in);
	s=sc.next();
	String rev ="";
	int leg=s.length();
	for ( int i=leg-1;i>=0;i--) {
		 
		 rev =rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("pallinderome = " +rev);

	}
	else{
		System.out.println("not pallindrome = "+rev);
	}
	
}}