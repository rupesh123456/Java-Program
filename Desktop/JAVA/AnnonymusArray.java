class Annonymus_Array
{
	public static void main(String...ru)

     {
     Annonymus_Array.sum(new int[][]{{10,20,30},{23,467,89}});
     }
     static void sum(int a[][])
     {
     int total=0;
     for (int ii[]:a ) {
     	
     	for(int i:ii)
     	{
     		total=total+i;
     	}
     	
     }
     System.out.println(total);
     }

}