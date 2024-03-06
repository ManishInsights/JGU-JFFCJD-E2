class Prog15
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 4; i++)
		{
			for(int j = 3; j < 28; j *= 3)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}