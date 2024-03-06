class Prog14
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 3)
		{
			char j = 'A';	
			while(j < 'F')
			{
				System.out.print(j + " ");
				j += 2;
	
			}
			System.out.println();
			i++;
		}
	}
}