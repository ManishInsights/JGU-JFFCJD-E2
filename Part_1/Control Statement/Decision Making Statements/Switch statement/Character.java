class VowelConsonant
{
	public static void main(String[] args)
	{
		char c = 'm';
		switch(c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			{
				System.out.println("Vowel");
				break;
			}
			
			default :
			{
				if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
				{
					System.out.println("Consonant");
				}
				else
				{
					System.out.println("Invalid");
				}
			}			
			
		}
	}
}