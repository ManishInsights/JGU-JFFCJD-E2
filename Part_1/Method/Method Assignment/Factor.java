class Factor
{
	public static void main(String[] args)
	{
		int num1 = 7;
		factor(num1);
	}
	public static void factor(int a)
	{
		System.out.println("Factors of number " + a + " are :- ");
		for(int i = 1; i <= 12; i++)
		{
			if(a % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}