import pkg.Square;

class MainDemoPkgSquare
{
	public static void main(String args[])
	{
		Square s=new Square(9);
		double ss=s.square();
		System.out.println("Square of given number is: "+ss);
	}
}