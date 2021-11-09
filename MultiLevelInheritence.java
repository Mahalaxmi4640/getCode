class Whatsappv1
{
	public void msg()
	{
		System.out.println("only text Msg");
	}
}
class Whatsappv2 extends Whatsappv1  //and that super class inheriting the properties of another super class
{
	public void Voice()
	{
		System.out.println("Voice msg");
	}
}
class Whatsappv3 extends Whatsappv2 //sub-class inhering the properties of super class
{
	public void videoCall()
	{
		System.out.println("videoCall");
	}
}
class MultiLevelInheritence
{
	public static void main(String[] args) {
		Whatsappv3 v1 = new Whatsappv3();
		v1.msg();
		v1.Voice();
		v1.videoCall();
		Whatsappv2 v2 = new Whatsappv2();
		v2.msg();
		v2.Voice();



	}
}