class Prog4
{
	public static void main(String[] args)
	{
		int num1 = 15, num2 = 2, res = num1%num2;
		System.out.println(res);
		System.out.print(mod(num1,num2));
	}
	public static int mod(int a, int b)
	{
		return a % b;
	}
}