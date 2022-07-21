class A
{
	int i,j;
	void show()
	{
		System.out.println("i="+i+"\n"+"j="+j);
	}
	int sum()
	{
		return i+j;
	}
}
class B extends A
{
	int k;
	void showk()
	{
		show();
		System.out.println("k="+k);
	}
	int sumk()
	{
		return i+j+k;
	}
}
class MainDemoInheritance
{
	public static void main(String args[])
	{
		A obj1=new A();
		obj1.i=10;
		obj1.j=20;
		obj1.show();
		int s1=obj1.sum();
		System.out.println(s1);
		B obj2=new B();
		obj2.i=30;
		obj2.j=40;
		obj2.k=50;
		obj2.showk();
		int s2=obj2.sumk();
		System.out.println(s2);
	}
}