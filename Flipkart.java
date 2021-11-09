class Flipkart
{
	public void login()
	{
		System.out.println("Logged in");

	}
	public void logout()
	{
		System.out.println("Logged out");

	}

}
class Cloths extends Flipkart
{
	public void western()
	{
		System.out.println("Western");

	}
	public void traditional()

	{
		System.out.println("Traditional");

	}

}
class Electronics extends Flipkart
{
	public void laptop()
	{
		System.out.println("Laptop");

	}
	public void phones()
	{
		System.out.println("phones");

	}

}
class Grocery extends Flipkart
{
	public void vegetables()
	{
		System.out.println("vegetables");

	}

}
class LaptopBrand extends Electronics
{
	public void dell()
	{
		System.out.println("dell");

	}
	public void hp()
	{
		System.out.println("hp");

	}

}
class phoneBrand extends Electronics
{
	public  void onePlus()
	{
		System.out.println("onePlus");

	}
	public void iphones()
	{
		System.out.println("iphones");

	}

}
class Flipkart1
{
	  Electronics a1= new Electronics();
	  a1.laptop();
	  a1.phones();
	  //a1.login();
	  //a1.logout();



}