class Employee
{
	Long empid;
	String empName;
	String companyName;
	double sal;
	String experience;
	public Employee(Long empid,
	String empName,
	String companyName,
	double sal)
	{
		this.empid=empid;
		this.empName=empName;
		this.companyName=companyName;
		this.sal=sal;
	}

	public Employee(Long empid,
	String empName,
	String companyName,
	double sal,String experience)
	{
		this.empid=empid;
		this.empName=empName;
		this.companyName=companyName;
		this.sal=sal;
		this.experience=experience;

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
		System.out.println(experience);
		System.out.println();
	}
	public void showdetails1()
	{
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(companyName);
		System.out.println(sal);
		//System.out.println(experience);
	}

}
class Employee1
{
	public static void main(String[] args)
	{
		 Employee a1=new Employee(101l,"maha","IBM",1000.0,"89");
		 a1.showdetails();
		 
		 Employee a2=new Employee(102l,"maha1","IBM1",11000.0);
		 a2.showdetails1();

		  
	}
}