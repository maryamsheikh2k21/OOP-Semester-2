//How to make a class?
class Human
{
	double height;
	void eating()
	{
	System.out.println("Humans can eat.");
	}
	void running()
	{
	System.out.println("Humans can run.");
	}
}
class ClassMainDemo
{
	public static void main(String args[])
	{
	Human h=new Human();
	Human A=new Human();
	h.height=6.3;
	System.out.println(h.height);
	A.height=7.2;
	System.out.println(A.height);
	h.eating();
	A.eating();
	h.running();
	A.running();	
	}
}