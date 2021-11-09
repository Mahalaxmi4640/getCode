class hierSuperMulti
{
	public static void main(String[] args) 
	{

		Lenovo a=new Lenovo();
		a.taskBar();
		Dell a1=new Dell();
		a1.taskBar();
		Hp s2=new Hp();
		s2.taskBar();
	}
}
class Windows
{
	public void taskBar()
	{
		System.out.println("4 Icons");

	}
}
class Dell extends Windows
{
	@Override
	public void taskBar()
	{
		super.taskBar();
		System.out.println("5 Icons");

	}
}
class Hp extends Windows
{
	@Override
	public void taskBar()
	{
		super.taskBar();
		System.out.println("6 Icons");

	}
}
class Lenovo extends Windows
{
	@Override
	public void taskBar()
	{
		super.taskBar();
		System.out.println("9 Icons");

	}
}