 class Prog5
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			int j = 5;
			do
			{	
				System.out.print(j + " ");
				j += 5;
			}while(j < 21);
			System.out.println();
			i++;
		}while(i < 4);
	}
}