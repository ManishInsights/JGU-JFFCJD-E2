class Prog14
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			char j = 'A';	
			do
			{
				System.out.print(j + " ");
				j += 2;
	
			}while(j < 'F');
			System.out.println();
			i++;
		}while(i < 3);
	}
}