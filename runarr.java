import java.util.*;
class runarr
{
	public static void encode(String arr[],int l)
	{
		for(int i=0;i<l;i++)
		{
			int count=1, zero=1;
			while(i<l-1 && arr[i].equalsIgnoreCase(arr[i+1]))
			{
				if(arr[i]=="0")
					zero++;
				count++;
				i++;
			}
			if(count>3)
            {
            	System.out.print("0"); 
            	System.out.print(count);
            	System.out.print(arr[i]);
            }
            else if(count<=3)
            {
            	if(arr[i]=="0")
            	{
            		 if(zero==1)
                     	System.out.print("00");
            		 else if(zero>1 && zero<4)
                     {
                    	System.out.print("0"); 
                     	System.out.print(zero); 
                     	System.out.print(arr[i]);
                     }
            	}
            	else
            	    for(int j=0;j<count;j++)
            	    	System.out.print(arr[i]);
            }
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE TIMES YOU WANT TO RUN: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER THE LENGTH: ");
			int l=sc.nextInt();
			System.out.println("ENTER THE INPUT: ");
			String arr[]=new String[l];
			for(int j=0;j<l;j++)
				arr[j]=sc.next();
			encode(arr,l);
		}
		sc.close();
	}
}
