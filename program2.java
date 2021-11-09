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
}
class Program2
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts..");
		System.out.println(new SquirrelPlay().T1(70,false));//Calling Non-Static method from Different Class
		
		System.out.println("Program ends...");
		
	}
}