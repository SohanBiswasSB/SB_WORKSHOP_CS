import java.io.IOException;
import java.util.Scanner;
public class nsum
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
			int sum=0;
			for(int i=0;i<n;i++)
			{
				System.out.println("ENTER THE NUMBER: ");
				int a=in.nextInt();
				sum+=a;
			
			}
			System.out.println("SUM IS: "+sum);
		}

	}
