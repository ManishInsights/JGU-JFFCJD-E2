class Prog10
{
	public static void main(String[] args)
	{
		byte num1 = 3, num2 = 6, num3 = 1;

		System.out.print(num2 + " power of  " + num1 + " = " + pow(num1,num2,num3));
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