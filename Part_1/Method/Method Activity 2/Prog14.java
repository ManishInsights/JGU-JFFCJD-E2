class Prog14
{
	public static void main(String[] args)
	{
		float len = 4.1f, wid = 3.2f;
		System.out.print("Perimeter of Rectangle = " + per(len,wid));
	}
	
	public static float per(float a, float b)
	{
		return 2 * ( a + b);
	}
}