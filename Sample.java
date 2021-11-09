class Sample
{
	  int a=10;
	public  void test() {
		int a=160;
		System.out.println(a);
		System.out.println( this.a);
	}
	public static void main(String[] args)
	{
		new Sample().test();
		System.out.println(new Sample().a);

		
	}
}