import java.io.IOException;
import java.util.*;
public class fsum
	{
	public static void main(String args[])throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER HOW MANY TIMES YOU WANT TO RUN: ");
		int n=in.nextInt();
		if(n==0)
		{
			System.out.println("IT CANNOT BE 0, ENTER MORE THAN 0... ");
			System.exit(0);
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER THE NUMBER: ");
			int a=in.nextInt();
			k=fsum(a,n);
		}
		System.out.println("THE SUM IS: "+k);
	}
		static int fsum(int x, int z)
		{
			int sum=0;
			for(int i=0;i<z;i++)
			{
				sum+=x;
				
			}
			return sum;
		}
	
}
