class Factorial3
{
	public static void main(String[] args)
	{
		int n = 4;
		System.out.println("Factorial of " +  n + " is " + fact(n,1));
		
	}

	public static int fact(int n , int fact )
	{
		
		if(n == 0 || n==1)
		{
			return fact;
		}
		else
		{
			for(int i = n; i > 0; i--)
			{
				fact = fact * i;
			}
		
		}
		return fact;
	}
}