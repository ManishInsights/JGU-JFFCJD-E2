class Prog8
{
	public static void main(String[] args)
	{
		byte num1 = 5, num2 = 2, num3 = 15, num4 = 3, num5 = 1;
		
		System.out.print("Cube of " + num1 + " = " + cube(num1,num4,num5) + ", Cube of " + num2 + " = " + cube(num2,num4,num5) + ", Cube of " + num3 + " = " + cube(num3,num4,num5));
	}
	public static int cube(int a, int b, int c)
	{
		for(int i = 1; i < b+1; i++)
		{
			c *= a;
		}
		return c;
	}
}
