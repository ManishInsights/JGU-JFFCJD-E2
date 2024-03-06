class Prog9
{
	public static void main(String[] args)
	{
		char c = 'p';
		while(c > 'l')
		{
			int j = 1;
			while(j < 5)
			{
				System.out.print(c + " ");
				j++;
			}
			System.out.println();
			c--;
		}
	}
}