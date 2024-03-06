class Prog1
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			char c = 'A';
			do
			{
				System.out.print(c + " ");
				c++;
			}while(c < 'D');
			System.out.println();
			i++;
		}while(i < 4);
	}
}