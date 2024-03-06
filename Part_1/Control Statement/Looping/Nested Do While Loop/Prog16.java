class Prog16
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				int k = j % 2;
				System.out.print(k + " ");
				j++;
			}while(j < 5);
			System.out.println();
			i++;
		}while(i < 4);
	}
}