interface Post
{
	String tag=" ";
	String loc= " ";
	String caption= " ";
	public void comment();
	public void like();
	public void share();

}
interface PhotoEdit 
{
	public void instaFilters();
	
	public void crop();


}
class Photo implements PhotoEdit,Post
{ 
	double size;
	String color;
	double resol;

	@Override
	public void comment()
	{
		System.out.println("comment");

	}
	@Override
	public void like()
	{
		System.out.println("like");

	}
	@Override
	public void share()
	{
		System.out.println("share");

	}
	@Override
	public void instaFilters()
	{
		System.out.println("instaFilters");

	}
	@Override	
	public void crop()
	{
		System.out.println("crop");

	}


	public void filters()
	{
		System.out.println("filters");

	}

}
interface VideoEdit 
{
	public void slowmotion();
	public void time();


}
class Video implements VideoEdit,Post
{
	double size;
	String time;
	String quality;
	@Override
	public void comment()
	{
		System.out.println("comment");

	}
	@Override
	public void like()
	{
		System.out.println("like");

	}
	@Override
	public void share()
	{
		System.out.println("share");

	}
	@Override
	public void slowmotion()
	{
		System.out.println("slowmotion");

	}
	@Override
	public void time()
	{
		System.out.println("time");

	}


	public void speed()
	{
		System.out.println("speed");

	}

}
class Insta
{
	public static void main(String[] args) 
	{
		Photo a=new Photo();
		a.filters();
		a.instaFilters();
		a.crop();
		a.comment();
		a.like();
		a.share();
		Video b= new Video();

		
	}
}