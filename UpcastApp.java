class Customer extends Object
{
	public void buyProduct()
	{
		System.out.println("buyProduct");

	}
	public void cancelProduct()
	{
		System.out.println("cancelProduct");

	}
}
class Admin extends Object
{
	public void  addProduct()
	{
		System.out.println("addProduct");

	}
	public void removeProduct()
	{
		System.out.println("removeProduct");

	}
}
class LoginPage
{
	public void login(Object ref)
	{
		if(ref instanceof Customer )
		{
			Customer c1=(Customer)ref;
			c1.buyProduct();
			c1.cancelProduct();
		}
		else
		{
			Admin a1=(Admin)ref;
			a1.addProduct();
			a1.removeProduct();
		}

	}
}
class UpcastApp
{
	public static void main(String[] args) 
	{
		Customer ct=new Customer();
		Admin ad=new Admin();
		LoginPage lp=new LoginPage();
		lp.login(ad);
		
	}

}