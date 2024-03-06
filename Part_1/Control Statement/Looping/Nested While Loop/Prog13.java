class Prog13
{
	public static void main(String[] args)
	{
		int i = 1,  k = 9;
		while(i < 4)
		{
			int j = 1;	
			while(j < 4)
			{
				System.out.print(k + " ");
				k--;
				j++;

			}
			System.out.println();
			i++;
		}
	}
}