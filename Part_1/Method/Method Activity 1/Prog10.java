class Prog10
{
	public static void main(String[] args)
	{
		System.out.print(sumOfFactor(6,0));
	}

	public static int sumOfFactor(int a, int b)
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