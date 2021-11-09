class Poly
{
	public static void main(String[] args) {
		Sample s1=new Sample();
		Demo d1=s1;
		d1.one();
		d1.three();
	}

}
class Demo
{
	public void one()
	{
		System.out.println("one");

	}
	public void three()
	{
		System.out.println("three");

	}
}
class Sample extends Demo
{
	public void two()
	{
		System.out.println("two");

	}
	public void three()
	{
		System.out.println("three overriden");

	}
}