class Less20
{
	public static boolean T1(int n)
	{
		System.out.println(T2(23));//Calling Static method from same Class
		if(n%20==18 || n%20==19)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean T2(int in1)
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
class Program6{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		Less20 a=new Less20();
		System.out.println(a .T1(18));//Calling Static Method from Different Class	
		Less20 a1=new Less20();
		System.out.println(a1.T1(30));
		System.out.println(a .T1(18));	

		System.out.println("Program ends.. ");
		
	}
}