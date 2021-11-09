interface User
{
	public void transaction();
}
class Atm implements User
{
	public void transaction()
	{
		System.out.println("atm user");

	}

}
class Web implements User
{
	public void transaction()
	{
		System.out.println("web user");

	}

}
class Service
{
	//User ref;
	public User createUserObject(int userid)
	{
		if(userid==100)
		{
			User ref=new Web();
			return ref;
		}
		else
		{
			User ref=new Atm();
			return ref;
		}

	}
}
class Abstaction
{
	public static void main(String[] args) {
		Service s1=new Service();
		User u1=s1.createUserObject(100);
		u1.transaction();

	}
}
