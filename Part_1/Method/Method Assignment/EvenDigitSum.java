class EvenDigitSum
{
	public static void main(String[] args)
	{
		int num1 = 242;
		System.out.print("Sum of the Even Digits of " + num1 + " = " + sumOfEvenDigits(num1,0));
	}
	public static int sumOfEvenDigits(int a, int b)
	{
		while(a != 0)
		{
			if(isEven(a % 10))
			{
				b = sum(b,a % 10);
				
			}
			a = a / 10;
		}
		return b;
	}
	public static boolean isEven(int a)
	{
		if(a % 2 == 0)
		{
			return true;
		}
		return false;
	}
	public static int sum(int a, int b)
	{
		return a + b;
	}
}