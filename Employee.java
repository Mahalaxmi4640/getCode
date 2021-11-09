class Employee1
{
	Long empid;
	String empName;
	String companyName;
	double sal;

	public Employee1(Long empid,
	String empName,
	String companyName,
	double sal)
	{
		this.empid=empid;
		this.empName=empName;
		this.companyName=companyName;
		this.sal=sal;

	}
	public void Login()
	{
		System.out.println("Employee Logged in");
	}
	public void Logout()
	{
		System.out.println("Employee Logged out");

	}
	public void showdetails()
	{
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(companyName);
		System.out.println(sal);
	}

}
class Employee
{
	public static void main(String[] args)
	{
		 Employee1 a1=new Employee1(101l,"maha","IBM",1000.0);
		 a1.showdetails();
		 Employee1 a2=new Employee1(102l,"maha1","IBM1",11000.0);
		 a2.showdetails();
	}
}