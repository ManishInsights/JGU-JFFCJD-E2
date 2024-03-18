class Factorial
{
	public static void main(String[] args)
	{
		int n = 3;
		System.out.print("Factorial of " + n + " is " + fact(n));
	}
	public static int fact(int a)
	{
		if(a == 0)
		{
			return 1;
		}
		return (a * fact(a - 1));
	}
}