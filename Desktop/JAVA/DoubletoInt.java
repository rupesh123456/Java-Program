   
//wap containing a method to convert an array of double data type to int 
//data type such that the method access the double value array as parameter
//and returns the int type of it in main() method for displaying the output.
class Addition{ 
        
    public double add(double a, double b, double c){ 
           
        double sum = a+b+c; 
        return sum; 
    } 
} 
   
class Double_Int { 
    public static void main (String[] args) { 
           
        Addition ob = new Addition(); 
        double sum3 = ob.add(1.0,2.0,3.0); 
        int b = (int)(sum3);

        System.out.println("sum of the three double value :" +b); 
           
           
    } 
} 