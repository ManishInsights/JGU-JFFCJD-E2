class Prog5
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 4)
		{
			int j = 5;
			while(j < 21)
			{	
				System.out.print(j + " ");
				j += 5;
			}
			System.out.println();
			i++;
		}
	}
}