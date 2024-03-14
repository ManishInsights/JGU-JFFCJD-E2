class Digit
{
	public static void main(String[] args)
	{
		int n = 2345, rem, quot, num = 10;
		System.out.print("Digit of Number " + n + " are ");
		quot = n/num;
		rem = n%num;
		while(quot != 0)
		{
			
			if(quot != 0)
			{
				System.out.print(rem + ", ");	
			}
			rem = quot % num;
			quot = quot/num;	
		}
		System.out.print(rem);
	}
}