class Power
{
	public static void main(String[] args)
	{
		byte base = 3, power = 3;

		System.out.print(power + " power of  " + base + " = " + pow(base,power));
	}

	public static int pow(int a, int b)
	{
		int c = 1;
		for(int i = 1; i < b+1; i++)
		{
			c *= a;
		}
		return c;
	}
}