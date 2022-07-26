class ArrayMax
{
	public static void main(String args[])
	{
		int arr[]={6,4,7,2,3};
		int max,i,index;
		max= arr[0];
		index=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println("Maximum value is "+max+" at index number "+index);
	}
}