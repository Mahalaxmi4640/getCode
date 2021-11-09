 class Account1 
{
	 double bal;

	public double petBal() {
		return this.bal;
	}

	public void metBal(double bal) {
		this.bal = bal;
	}
	
	
}
class Service 
{
	public void deposit(double amount, Account1 a1)
	{
		double b1= a1.petBal();
				b1=b1+amount;
		a1.metBal(b1);
	}
	public void withdraw(double amount,Account1 a1)
	{
		if(amount>0) {
		double b2=a1.petBal();
		b2=b2-amount;
		a1.metBal(b2);
		}
		
	}
	public void checkbal(Account1 a1)
	{
		System.out.println(a1.petBal());
	}

}
class Main23 
{

	public static void main(String[] args) 
	{
		Account1 at=new Account1();
		Service s1=new Service();
		s1.deposit(1000, at);
		s1.checkbal(at);
		s1.withdraw(200, at);
		s1.checkbal(at);
		//s1.withdraw(0, at);
		
		

	}

}