class ReturnBool
{	
	public static void main(String[] args)
	{
		if(check())
		{
			System.out.print("Your Payment is 1000");
		}
		else
		{
			System.out.print("Your Payment is 500");
		}
	}
	public static boolean check()
	{
		return true;
	}
}
