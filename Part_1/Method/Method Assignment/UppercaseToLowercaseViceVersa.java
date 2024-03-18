class UppercaseToLowercaseViceVersa
{
	public static void main(String[] args)
	{
		char ch = 'G';
		upper(ch);
	}
	public static void upper(char ch) 
	{
    		if(ch >= 'a' && ch <= 'z') 
		{
        		ch = (char) (ch - 'a' + 'A');
        		System.out.println("Upper case : " + ch);
    		}
		else if (ch >= 'A' && ch <= 'Z') 
		{
        		ch = (char) (ch - 'A' + 'a');
        		System.out.println("Lower case : " + ch);
    		} 	
		else
		{
        		System.out.println("It is not Uppercase A - Z and Lowercase a - z");
    		}
	}

}
