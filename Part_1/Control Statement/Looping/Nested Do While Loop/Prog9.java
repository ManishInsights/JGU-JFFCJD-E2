class Prog9
{
	public static void main(String[] args)
	{
		char c = 'p';
		do
		{
			int j = 1;
			do
			{
				System.out.print(c + " ");
				j++;
			}while(j < 5);
			System.out.println();
			c--;
		}while(c > 'l');
	}
}