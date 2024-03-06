class Prog4
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 4)
		{
			char c = 'Z';
			while(c > 'V')
			{
				System.out.print(c + " ");
				c--;
			}
			System.out.println();
			i++;
		}
	}
}