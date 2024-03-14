class Factors
{
	public static void main(String[] args)
	{
		int n = 17;
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0 && i == 1)
			{
				System.out.print("Factors of " + n + " is " + i);
			}
			else if(n % i == 0)
			{
				System.out.print(", " + i);
			}
		}
	}
}