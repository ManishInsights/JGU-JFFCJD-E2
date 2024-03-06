class Prog12
{
	public static void main(String[] args)
	{
		char c = 'I';
		int i = 1;
		while(i < 4)
		{
			int j = 1;
			while(j < 4)
			{
				System.out.print(c + " ");
				c--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}