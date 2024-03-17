class Prog1
{
	public static void main(String[] args)
	{
		int num1 = 2228;
		digit(num1);
	}
	public static void digit(int a)
	{
		System.out.print("Digit of Number " + a + " are " + a % 10);
		a /= 10;
		while(a != 0)
		{
			
			if(a != 0)
			{
				System.out.print(", " + a % 10);	
			}
			a /= 10;	
		}
	}
}
                