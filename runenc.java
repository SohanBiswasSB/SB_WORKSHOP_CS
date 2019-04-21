import java.util.Scanner;
class runenc
{
	public static void ecrypt(String str,int n)
	{ 
		for(int i=0;i<n;i++)
        { 
        	int count=1;
        	int zero=1;
        	while (i<n-1 && str.charAt(i)==str.charAt(i+1))
            { 
        		if(str.charAt(i)=='0')
        			zero++;
            	count++; 
         		i++; 
         	}
        	if(count>3)
            {
            	System.out.print("0"); 
            	System.out.print(count);
            	System.out.print(str.charAt(i));
            }
            else if(count<=3)
            {
            	if(str.charAt(i)=='0')
            	{
            		 if(zero==1)
                     	System.out.print("00");
            		 else if(zero>1 && zero<4)
                     {
                    	System.out.print("0"); 
                     	System.out.print(zero); 
                     	System.out.print(str.charAt(i));
                     }
            	}
            	else
            	    for(int j=0;j<count;j++)
            	    	System.out.print(str.charAt(i));
            }
        }
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO RUN: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER THE LENGTH: ");
			int length=sc.nextInt();
			System.out.println("ENTER THE CODE: ");
			String str=sc.next();
			System.out.println(str);
			ecrypt(str,length);
		}
		sc.close();
	}
}
