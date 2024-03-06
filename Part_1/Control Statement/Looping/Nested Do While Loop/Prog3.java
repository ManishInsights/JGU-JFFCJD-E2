class Prog3
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			int j = 4;
			do
			{
				System.out.print(j + " ");
				j++;
			}while(j < 8);
			System.out.println();
			i++;
		}while(i < 4);
	}
}