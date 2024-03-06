class IsOrNotUppercase
{
	public static void main(String[] args)
	{
		char c = 'A', c2 = 'a';
		if(c >= 'A' && c <= 'Z')
		{
			System.out.println(c + " is Uppercase");
		}
		if(!(c2 >= 'A' && c2 <= 'Z'))
		{
			System.out.print( c2 + " is Not Uppercase");
		}
	}
}