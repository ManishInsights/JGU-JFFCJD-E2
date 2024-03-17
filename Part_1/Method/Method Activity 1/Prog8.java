class Prog8
{
	public static void main(String[] args)
	{
		byte num1 = 21, num2 = 23, num3 = 25, num4 = 27, num5 = 29;
		int res = num1*num2*num3*num4*num5;
		
		System.out.println(res);
		System.out.println(prodOfOdd(20,30,1));
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
	
	public static int prodOfOdd(int start, int end, int b)
	{
		for(int i = start; i <= end; i++)
		{
			if(isOdd(i))
			{
				b *= i;
			
			}
		}
		return b;
	}
}