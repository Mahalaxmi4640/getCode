class GraphMethodOverloading 
{
	public void drawPoints(int x, int y)
	{
		System.out.println("x="+x +"  y="+y);
	}
	public void drawPoints(double x, int y)
	{
		System.out.println("x="+x +"  y="+y);

	}
	public void drawPoints(int x, double y)
	{
		System.out.println("x="+x +"  y="+y);

	}
	public void drawPoints(double x,double y)
	{
		System.out.println("x="+x +"  y="+y);

	}
	public static void main(String[] args) {
		GraphMethodOverloading a= new GraphMethodOverloading();
		a.drawPoints(1,1);
		a.drawPoints(1.0,1);
		a.drawPoints(1,1.5);
		a.drawPoints(1.2,1.4);
	}
}