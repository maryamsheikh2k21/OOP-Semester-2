class Figure
{
	double l,w;
	void show()
	{
		System.out.println("Length="+l+"\n"+"Width"+w);
	}
	double area()
	{
		System.out.println("Area of figure class");
		return 0;
	}
}
class Rectangle extends Figure
{
	double area()
	{
		return l*w;	
	}	
}
class MainDemoMethodOverriding
{
	public static void main(String args[])
	{
	Figure f=new Figure();
	f.l=3.5;
	f.w=4.9;
	f.show();
	double af=f.area();
	System.out.println(af);
	Rectangle r=new Rectangle();
	r.l=10.0;
	r.w=10.0;
	double as=r.area();
	System.out.println("Area of square="+as);
	}
}