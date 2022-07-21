class Box
{
	double height,width,depth;
	Box(double h, double w, double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	Box(double c)
	{
		height=width=depth=c;
	}
	Box()
	{
		height=1.1;
		width=1.2;
		depth=1.3;
	}
}
class MainDemoConstructorOverloading
{
	public static void main(String args[])
	{
		Box mybox1=new Box(10,20,30);
		System.out.println(mybox1.height+"\n"+mybox1.width+"\n"+mybox1.depth+"\n");
		Box mybox2=new Box(44);
		System.out.println(mybox2.height+"\n"+mybox2.width+"\n"+mybox2.depth+"\n");
		Box mybox3=new Box();
		System.out.println(mybox3.height+"\n"+mybox3.width+"\n"+mybox3.depth);
	}
}