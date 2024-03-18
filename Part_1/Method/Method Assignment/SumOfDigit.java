class SumOfDigit
{
	public static void main(String[] args)
	{
		short num1 = 31987;
		System.out.print("Sum of Digits of " + num1 + " = " + sumOfDigits(num1,0));		

	}
	public static int sumOfDigits(int a, int b)
	{
		while(a != 0)
		{
			b = sum(b,a%10);
			a /= 10;
		}
		return b;
	}
	public static int sum(int a , int b)
	{
		return a + b;
	}

	
}