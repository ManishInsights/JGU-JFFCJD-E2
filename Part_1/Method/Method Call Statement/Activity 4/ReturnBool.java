class ReturnBool
{
	public static void main(String[] args)
	{
		int a = 2;
		if(isEven(a))
		{
			System.out.print("Number is Even");
		}
		else
		{
			System.out.print("Number is Odd");	
		}
	}
	public static boolean isEven(float a)
	{
		if(a % 2 == 0)
		{
			return true;
		}
		return false;
	}
}