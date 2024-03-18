class Two
{
	public static void main(String[] args)
	{
		int a = 4 , b = 2;
		System.out.println("Sum of add of, add of and product of numbers "+ a + " and " + b + " is " + sumOfSumAndProd(a,b) );
		
	}
	public static int sumOfSumAndProd(int x, int y)
	{
		return sum(x , y) + prod(x , y);
	}
	public static int sum(int a, int b)
	{
		return a + b;
	}
	public static int prod(int a, int b)
	{
		return a * b;
	}
}