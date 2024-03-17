class Prog7
{
	public static void main(String[] args)
	{
		byte num1 = 2, num2 = 4, num3 = 6, num4 = 8, num5 = 10, num6 = 12, num7 = 14,
		     num8 = 16, num9 = 18, num10 = 20;
		int res = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;

		System.out.println(res);
		System.out.println(sumOfEven(1,20,0));
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
	
	public static int sumOfEven(int start, int end, int b)
	{
		for(int i = start; i <= end; i++)
		{
			if(isEven(i))
			{
				b += i;
			
			}
		}
		return b;
	}

}