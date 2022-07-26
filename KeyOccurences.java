//a value can occur more than once, find out more than one occurences of key value in array
class KeyOccurences
{
	public static void main(String args[])
	{
		int arr[]={5,3,5,8,5,3};
		int key,i;
		key=5;
		int index={0,0,0,0,0,0};
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				index[i]=i;
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(index[i]);
		}
	}
}