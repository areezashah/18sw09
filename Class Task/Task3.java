class Task3
{
	public static void main(String args[])
	{
		int result=1, x=1;
		int fact = Integer.parseInt(args[0]);
		while(x<=fact)
		{
			result=result*x;
			x++;
		}
	System.out.println("Factorial of "+fact+" is = "+result);
	}
}