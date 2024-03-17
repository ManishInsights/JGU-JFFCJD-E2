class Prog5
{
	public static void main(String[] args)
	{
		short num1 = 9298;
		System.out.print("Sum of the Odd Digits of " + num1 + " = " + sumOfOddDigits(num1,0)); 
		
	}
		public static boolean isOdd(int num)
	{
		if(num <= 0)
		{
			return false;
		}
		else if(num % 2 == 1)
		{
			return true;
			
		}
		return false;
			
	}
	
	public static int sumOfOddDigits(int a, int b)
	{
		while(a != 0)
		{
			if(isOdd(a % 10))
			{
				b += a % 10;
			}
			a /= 10;
		}
		return b;
	}

}
		