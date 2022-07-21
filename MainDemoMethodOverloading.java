class MyMath
{
	void square()
	{
		System.out.println(2*2);
	}
	int square(int n)
	{
		return n*n;
	}
	double square(double n)
	{
		return n*n;
	}
}
class MainDemoMethodOverloading
{
	public static void main(String args[])
	{
		MyMath obj=new MyMath();
		obj.square();
		int a1=obj.square(3);
		double a2=obj.square(2.5);
		System.out.println(a1+"\n"+a2);
	}
}