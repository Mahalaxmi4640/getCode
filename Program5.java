class SquirrelPlay
{
	public  boolean T1(int temp, boolean isSummer)
	{
		
		
		
		if (temp<=90 && temp>=60 && isSummer==false) 
		{
			return true;			
		}
		else if(temp>=60 && temp<=100 && isSummer==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// public  boolean T2(String[] args)
 //    {
 //    	int a=124;
 //    	int b=276;
 //    	//bitwise and operator
 //    	int c= a & b;
 //    	return c;
	// 	//System.out.println(c);
 //        //bitwise or operator
	// 	c=a|b;
	// 	return c;
	// 	//System.out.println(c);
 //        //bitwise xor operator
	// 	c=a^b;
	// 	return c;
	// 	//System.out.println(c);
	// }
}

class Program5
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts..");
		//System.out.println(new SquirrelPlay().T1(70,false));//Calling Non-Static method from Different Class

		SquirrelPlay a=new SquirrelPlay();
		System.out.println(a.T1(70,false));
		SquirrelPlay a1=new SquirrelPlay();
		System.out.println(a1.T1(90,true));

		System.out.println("Program ends...");
		
	}
}