class Employee
{
	private int Emp_id;
	public void setdata(int Emp_id1)
	{
		Emp_id=Emp_id1;
	}
   public int getData()
   {
   	return Emp_id;
   }
}
class Company
{
	public static void main(String...ru)
	{
		Employee E1= new Employee();
		E1.setdata(100);
		System.out.println(E1.getData());
	}
}