class Task6
{
	public static void main(String args[])
	{
		int Array[]={5,3,6,7,9,1,0,4,5};
		int count=0;
		int find=Integer.parseInt(args[0]);
		for(int i=0; i<Array.length; i++)
		{
			if(Array[i]==find)
			{
				System.out.println(find +" found at Array["+ i +"]");
				count++;
			}
		}
		if(count==0)
		System.out.print(find +" Not found in array");
	}
}

