class Prog15
{
	public static void main(String[] args)
	{
		System.out.print(prodOfDiv(17,1));
	}

	public static int prodOfDiv(int a, int b)
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