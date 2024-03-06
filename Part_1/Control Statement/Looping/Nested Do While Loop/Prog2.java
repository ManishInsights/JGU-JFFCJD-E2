class Prog2
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			char c = 'C';
			do
			{
				System.out.print(c + " ");
				c++;
			}while(c < 'G');
			System.out.println();
			i++;
		}while(i < 3);
	}
}