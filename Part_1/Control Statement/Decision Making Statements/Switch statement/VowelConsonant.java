class VowelConsonant
{
	public static void main(String[] args)
	{
		char c = 'a';
		switch(c)
		{
			case  'a','e','i','o','u':
			case  'A','E','I','O','U':
			{
				System.out.print("Vowel");
				break;
			}
			
			default:
			{
				if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
				{
					System.out.println("Vowel");
				}
				else
				{
					System.out.println("Invalid");
				}
			}			
			
		}
	}
}