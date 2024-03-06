class Prog16
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 4)
		{
			int j = 1;
			while(j < 5)
			{
				int k = j % 2;
				System.out.print(k + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}