class Sample
{ 
	final int v1=10;
	String str="Java";
	public void test()
	{
	   System.out.println("test() of Sample class");
	}
	public void count()
	{
		System.out.println("count() of Sample class");
	}
}
class Demo extends Sample
{
	public void display()
	{ 
		double z1=100;
		System.out.println("display() of Demo class");
	}
}
class SingleInheritence
{
	public static void main(String[] args) {
		Demo d1 =new  Demo();
		d1.test();
		
	}
}