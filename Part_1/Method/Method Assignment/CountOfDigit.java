class CountOfDigit
{
	public static void main(String[] args)
	{
		int num1 = 5674;
		System.out.print("Count of the Digits of " + num1 + " = " + countOfDigit(num1,0));
	}
	public static int countOfDigit(int a, int b)
	{
		while(a != 0)
		{
			b = count(b);
			a /= 10;
		}
		return b;
	}
	public static int count(int a)
	{
		return ++a;
	}
}