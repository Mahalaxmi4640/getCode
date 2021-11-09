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
	public static void main(String[] args) {
		
	
	  Electronics a1= new Electronics();
	  a1.laptop();
	  a1.phones();
	  a1.login();
	  a1.logout();
	  System.out.println("------------------");

	  Cloths a2=new Cloths();
	  a2.traditional();
	  a2.western();
	  a2.login();
	  a2.logout();
	  System.out.println("-----------------");

	  Grocery a3 = new Grocery();
	  a3.vegetables();
	  a3.login();
	  a3.logout();
	  System.out.println("------------------");

	  LaptopBrand a4= new LaptopBrand();
	  a4.dell();
	  a4.hp();
	  a4.phones();
	  a4.laptop();
	  a4.login();
	  a4.logout();
	  System.out.println("----------------");

	  phoneBrand a5 = new phoneBrand();
	  a5.onePlus();
	  a5.iphones();
	  a5.laptop();
	  a5.phones();
	  a5.login();
	  a5.logout();
	  
	
	}



}