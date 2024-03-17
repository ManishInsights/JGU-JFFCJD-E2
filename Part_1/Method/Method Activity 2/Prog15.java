class Prog15
{
	public static void main(String[] args)
	{
		byte num1 = 6;
		
		System.out.print("Area of Square = " + area(num1) + ", Perimeter of Square = " + per(num1));
	}
	
	public static int area(int a)
	{
		return a * a;
	}

	public static int per(int a)
	{
		return 4 * a;
	}
}