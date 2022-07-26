class ArrayMin
{
	public static void main(String args[])
	{
		int arr[]={6,4,7,2,3};
		int min,i,index;
		min= arr[0];
		index=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				index=i;
			}
		}
		System.out.println("Minimum value is "+min+" at index number "+index);
	}
}
