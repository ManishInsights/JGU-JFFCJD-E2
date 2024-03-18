class Lowercase
{
	public static void main(String[] args)
	{
		char ch = 'A';
		upper(ch);
	}
	public static void upper(char ch) 
	{
    		if (ch >= 'A' && ch <= 'Z') 
		{
        		ch = (char) (ch - 'A' + 'a');
        		System.out.println("Lower case : " + ch);
    		} 	
		else
		{
        		System.out.println("It is not A - Z");
    		}
	}

}
