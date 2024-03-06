class Prog11
{
	public static void main(String[] args)
	{
		char c = 'A';
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print(c + " ");
				c++;
				j++;
			}while(j < 4);
			System.out.println();
			i++;
		}while(i < 4);
	}
}