class Prog1
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 4)
		{
			char c = 'A';
			while(c < 'D')
			{
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
			i++;
		}
	}
}