class Prog2
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 3)
		{
			char c = 'C';
			while(c < 'G')
			{
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
			i++;
		}
	}
}