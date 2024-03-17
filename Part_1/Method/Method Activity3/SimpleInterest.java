class SimpleInterest
{
	public static void main(String[] args)
	{
		int p = 800000, t = 5, ri = 12;
		System.out.print("Simple Interest is " + si(p,t,ri));
	}
	public static float si(int p, int t, int ri)
	{
		return (p*t*ri)/100f;
	}
}