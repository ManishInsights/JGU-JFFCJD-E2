class Prog6
{
	public static void main(String[] args)
	{
		short num1 = 9298, num2 = 0;
		System.out.print(sumOfPrimeDigit(num1,num2));
		
	}
	public static int sumOfPrimeDigit(int a, int b)
	{	
		while(a != 0)
		{
			if(isPrime(a % 10))
			{
				b += a % 10;
			}
			a /= 10;
		}
		return b;
	}
	public static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		else
		{
			for(int i = 2; i * i <= num; i++)
			{
				if(num % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}
}
		