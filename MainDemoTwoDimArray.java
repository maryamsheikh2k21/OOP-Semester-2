class MainDemoTwoDimArray
{
	public static void main(String args[])
	{
		int[][] arr=new int[4][4];
		System.out.println("Number of rows: "+arr.length+"\n"+"Number of columns: "+arr[0].length);
		int b=10;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}