class Prog16
{
	public static void main(String[] args)	
	{
	 	for(int i = 1; i < 4; i++)
		{
			for(int j = 1; j < 5; j++)
			{
				int k = j % 2;
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}