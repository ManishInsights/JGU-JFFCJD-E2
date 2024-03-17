class Prog3
{
	public static void main(String[] args)
	{
		short num1 = 3174;
		System.out.print("Product of Digits of " + num1 + " = " + prodOfDigits(num1,1));		

	}
	public static int prodOfDigits(int a, int b)
	{
		while(a != 0)
		{
			b *= a % 10;
			a /= 10;
		}
		return b;
	}
}