class Less20
{
	public boolean T1(int n)
	{
		System.out.println(T2(23));//Calling Non-Static method from same Class
		if(n%20==18 || n%20==19)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean T2(int in1)
	{
		
		if(in1%20==1 || in1%20==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
}
class Program4{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		System.out.println(new Less20().T1(18));//Calling Non-Static Method from Different Class		
		System.out.println("Program ends.. ");
		
	}
}