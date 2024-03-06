class Prog13
{
	public static void main(String[] args)
	{
		int i = 1,  k = 9;
		do
		{
			int j = 1;	
			do
			{
				System.out.print(k + " ");
				k--;
				j++;

			}while(j < 4);
			System.out.println();
			i++;
		}while(i < 4);
	}
}