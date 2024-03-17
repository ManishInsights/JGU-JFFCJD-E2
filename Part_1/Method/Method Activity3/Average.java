class Average
{
	public static void main(String[] args)
	{
		int num1 = 25, num2 = 25, num3 = 25, num4 = 25;
		System.out.print(avg(num1 , num2, num3, num4));
	}
	public static float avg(int a, int b, int c, int d)
	{
		return (a + b + c + d)/4f;
	}
}