import java.util.*;
class Palindrome
{
	public static boolean checkpal(String x)
    {
		String rev="";
		if(x.length()>=3)
		{
			for(int i=x.length()-1;i>=0;i--)
           	rev+=x.charAt(i);
		}
        if(rev.equals(x))
        	 return true;
        else
        	return false;
    }
	public static void printAllPalindrome(String str) {
        for(int i=0;i<=str.length();i++)
            for(int j=i;j<str.length();j++)
                if(checkpal(str.substring(i,j+1)))
                    System.out.println(i+"  "+str.substring(i,j+1));
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer of times you want to run: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			{	
				System.out.println("Enter the length of the string: ");
				int length=sc.nextInt();
				System.out.println("Enter the String: ");
				String str=sc.next();
				printAllPalindrome(str);
			}
		sc.close();
	}
}
