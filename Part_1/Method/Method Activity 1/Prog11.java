class Prog11
{
	public static void main(String[] args)
	{
		System.out.print(prodOfFactor(6,1));
	}

	public static int prodOfFactor(int a, int b)
	{
		for(int i = 1; i <= a; i++)
		{
			if(a % i == 0)
			{
				b *= i;
			}
		}
		return b;
	}
}