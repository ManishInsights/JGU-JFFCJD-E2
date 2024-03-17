class ReturnType
{
	public static int add(int a, int b)
	{
		return a()+b();
	}
	
	public static void main(String[] args)
	{
		int c ;
		c = add(5,6);
		System.out.println(c);
		//System.out.println(compiler());//void type not allowed here
		System.out.println(add(5,6));
		compiler();
		
	}

	public static void compiler()
	{
		int c;
		c = add(10,5);
		System.out.print("The Addition of Number is " + c);
	}

	public static int a()
	{
		return 50;
	}

	public static int b()
	{
		return 6;
	}
}