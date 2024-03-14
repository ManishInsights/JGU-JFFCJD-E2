class Power
{
	public static void main(String[] args)
	{
		int n = 15, m = 2, z = 1;
		for(int i = 1; i <= m; i++)
		{
			z *= n;
		}
		System.out.println("Power of " + n + " is " + z);
	}
}