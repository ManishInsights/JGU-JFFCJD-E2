class Prog15
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			int j = 3;
			do
			{
				System.out.print(j + " ");
				j *= 3;
			
			}while(j < 28);
			System.out.println();
			i++;
		}while(i < 4);
	}
}