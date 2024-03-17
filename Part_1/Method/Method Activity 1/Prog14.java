class Prog14
{
	public static void main(String[] args)
	{
		System.out.print(sumOfDiv(21,0));
	}

	public static int sumOfDiv(int a, int b)
	{
		for(int i = 1; i <= a; i++)
		{
			if(a % i == 0)
			{
				b += i;
			}
		}
		return b;
	}
}