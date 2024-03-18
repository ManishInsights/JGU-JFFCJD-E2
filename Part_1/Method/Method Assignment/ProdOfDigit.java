class ProdOfDigit
{
	public static void main(String[] args)
	{
		int num1 = 56;
		System.out.print("Product of Digits of " + num1 + " = " + prodOfDigits(num1,1));
	}
	public static int prodOfDigits(int a, int b)
	{
		while(a != 0)
		{
			b = prod(b,a % 10);
			a = a / 10;
		}
		return b;
	}
	public static int prod(int a, int b)
	{
		return a * b;	
	}
}