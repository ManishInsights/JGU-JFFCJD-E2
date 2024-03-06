class IsSpecialCharacter
{
	public static void main(String[] args)
	{
		char c = '%';
		if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))
		{
			System.out.print(c + " is Special Character");
		}
	}
}