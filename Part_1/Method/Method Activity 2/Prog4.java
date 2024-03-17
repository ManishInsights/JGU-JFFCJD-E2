class Prog4
{
	public static void main(String[] args)
	{
		short num1 = 9268;
		System.out.print("Sum of the Even Digits of " + num1 + " = " + sumOfEvenDigits(num1,0));
	}
	public static int sumOfEvenDigits(int a, int b)
	{
		while(a != 0)
		{
			if(isEven(a % 10))
			{
				b += a % 10;
			}
			a /= 10;
		}
		return b;
	}
	public static boolean isEven(int num)
	{
		if(num <= 0)
		{
			return false;
		}
		else if(num % 2 == 0)
		{
			return true;
			
		}
		return false;
			
	}
}
		