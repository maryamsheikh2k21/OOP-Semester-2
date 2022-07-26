class ArrayKeySearch
{
	public static void main(String args[])
	{
		int arr[]={6,7,3,1,9};
		int key,i;
		key=3;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			break;	
		}
		System.out.println("The key is "+arr[i]+" at index number "+i);
	}
}