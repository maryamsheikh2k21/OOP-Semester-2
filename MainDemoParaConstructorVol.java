class Box
{
	double height,width,depth;
	Box(double h, double w, double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	void volume()
	{
		System.out.println(height*width*depth);
	}
}
class MainDemoParaConstructorVol
{
	public static void main(String args[])
	{
		Box mybox=new Box(10,20,30);
		mybox.volume();
	}
}