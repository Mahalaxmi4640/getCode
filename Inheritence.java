class Father   //super class , which is being inherited
{
	protected  void bike()   
	{
		System.out.println("Bike of father");
	}

}
class Son extends Father //sub-class inheriting from one super class 
{
	public void cycle() 
	{
		System.out.println("cycle of son");
	}
}
class Inheritence
{
	public static void main(String[] args)
	{
		Father s2=new Father();
		s2.bike();
		Son s1=new Son();
		s1.cycle();
		s1.bike();
		//Father.bike();
		

	}
}