class Prog7
{
	public static void main(String[] args)
	{
		byte num1 = 4, num2 = 7, num3 = 9, num4 = 2, num5 = 1;
		
		System.out.print("Square of " + num1 + " = " + sqr(num1,num4,num5) + ", Square of " + num2 + " = " + sqr(num2,num4,num5) + ", Square of " + num3 + " = " + sqr(num3,num4,num5));	}

	public static int sqr(int a, int b, int c)
	{
		for(int i = 1; i < b+1; i++)
		{
			c *= a;
		}
		return c;
	}
}