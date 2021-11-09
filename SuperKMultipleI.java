class SuperKMultipleI
{
	public static void main(String[] args) 
	{
		Whatsappv3 a= new Whatsappv3();
		a.sendMsg(); 
		// Whatsappv2 a= new Whatsappv2();
		// a.sendMsg();

		
	}
}
class Whatsappv1
{
	public void sendMsg()
	{
		System.out.println("Message sent,One Tick");
	}

}
class Whatsappv2 extends Whatsappv1
{
	@Override
	public void sendMsg()
	{
		super.sendMsg();
		System.out.println("Message Recieved, Two Ticks");

	}

}
class Whatsappv3 extends Whatsappv2
{
	@Override
	public void sendMsg()
	{		
		super.sendMsg();
		System.out.println("Message seen , Two Blue ticks");

	}

}