class Prog9
{
	public static void main(String[] args)
	{
		byte num1 = 2, num2 = 3, num3 = 5, num4 = 7, num5 = 11, num6 = 13, num7 = 17, num8 = 19;
		int res = num1+num2+num3+num4+num5+num6+num7+num8;

		System.out.println(res);
		
		System.out.println(sumOfPrime(1,20,0));

		
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
	
	public static int sumOfPrime(int start, int end, int b)
	{
		for(int i = start; i <= end; i++)
		{
			if(isPrime(i))
			{
				b += i;
			}
		}
		return b;
	}
}