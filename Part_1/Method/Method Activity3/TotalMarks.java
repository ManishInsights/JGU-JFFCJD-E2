class TotalMarks
{
	public static void main(String[] args)
	{
		int sci = 78, sst = 89, math = 99, eng = 88, hin = 67;
		System.out.print(perc(sci, sst, math, eng, hin));
	}
	public static float perc(int a, int b, int c, int d, int e)
	{
		return (a + b + c + d + e)/5f;
	}
}