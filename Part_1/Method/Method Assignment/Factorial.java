class Factorial
{
	public static void main(String[] args)
	{
		int a = 10,b = 1;
		System.out.print("Factorial of number " + a + " is " + fact(a,b));
	}
	public static int fact(int a, int b)
	{
		if(a == 0 || a == 1)
		{
			return 1;
		}	
		else
		{
			for(int i = a; i > 1; i--)
			{
				b *= i;
			}
		}
		return b;
	}
}