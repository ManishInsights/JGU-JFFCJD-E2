class Prog2
{
	public static void main(String[] args)
	{
		short num1 = 3174;
		System.out.print("Sum of Digits of " + num1 + " = " + sumOfDigits(num1,0));		

	}
	public static int sumOfDigits(int a, int b)
	{
		while(a != 0)
		{
			b += a % 10;
			a /= 10;
		}
		return b;
	}

	
}