class Count
{
	public static void main(String[] args)
	{
		int m = 1, n = 26, even = 0, odd = 0;
		if(n > m)
		{
			for(int i = m+1; i < n; i++)
			{
				if(i % 2 == 0)
				{
					even += 1;
				}
				else
				{
					odd += 1;
				}
			}
		}
		else
		{
			for(int i = n+1; i < m; i--)
			{
				if(i % 2 == 0)
				{
					even += 1;
				}
				else
				{
					odd += 1;
				}
			}
		}
		System.out.println("Numbers Between " + m + " and " + n + " are : "+ even +" and "+ odd);
	}
}