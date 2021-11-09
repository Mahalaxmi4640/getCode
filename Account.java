class Account
{
		String accType="Saving";
		Long accNo=45465472L;
		String bankName="ICIC";
		String IFSC="icici01723";
		String holderName="Mahalaxmi";
		double bal=0.0;
	public  void details()
	{
		 accType="Saving";
		 accNo=45465472L;		
		 holderName="Mahalaxmi";
		
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println(amt);
	} 
	public void withdraw(double amt)
	{
		bal=bal-amt;
		System.out.println(bal);
	}
	public void bal()
	{
		System.out.println(bal);
	}


	public static void main(String[] args) {

		
		Account a=new Account();
		a.deposit(10000.0);
		a.withdraw(300);
		a.details();
		//a.bal();

		Account a2=new Account();
		a2.withdraw(300);

		a.bal();


		
	}
}