class IsOrNotUppercaseOrVowel
{
	public static void main(String[] args)
	{
		char c = 'A';
		if((c >= 'A' && c <= 'Z') && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
		{
			System.out.println(c + " is Uppercase Vowel");
		}
		char c2 = 'Z';
		if(!((c2 >= 'A' && c2 <= 'Z') && (c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U')))
		{
			System.out.println(c2 + " is Uppercase but not Vowel");
		}
		char c3 = 'a';
		if(!((c3 >= 'A' && c3 <= 'Z') && (c3 == 'A' || c3 == 'E' || c3 == 'I' || c3 == 'O' || c3 == 'U')))
		{
			System.out.println(c3 + " is not Uppercase but Vowel");
		}
		char c4 = 'b';
		if(!((c4 >= 'A' && c4 <= 'Z') && (c4 == 'A' || c4 == 'E' || c4 == 'I' || c4 == 'O' || c4 == 'U')))
		{
			System.out.print(c4 + " is neither Uppercase nor Vowel");
		}
	}
}