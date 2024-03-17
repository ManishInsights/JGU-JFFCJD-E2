class Prog12
{
	public static void main(String[] args)
	{
		byte num1 = 8, num2 = 3, num3 = 1;

		System.out.print(num2 + " power of 8 = " + pow(num1,num2,num3));
	}

	public static int pow(int a, int b, int c)
	{
		for(int i = 1; i < b+1; i++)
		{
			c *= a;
		}
		return c;
	}
}