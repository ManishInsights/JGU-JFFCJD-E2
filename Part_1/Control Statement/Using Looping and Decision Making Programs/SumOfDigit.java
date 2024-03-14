class SumOfDigit
{
	public static void main(String[] args)
	{
		int n = 9999, rem, quot, num = 10, sum = 0;
		System.out.print("Sum of Digit of Number " + n + " are ");
		quot = n/num;
		rem = n%num;
		while(quot != 0)
		{
			
			if(quot != 0)
			{
				System.out.print(rem + " + ");	
			}
			sum += rem;
			rem = quot % num;
			quot = quot/num;	
		}
		sum += rem;
		System.out.print(rem + " = " + sum);
	}
}