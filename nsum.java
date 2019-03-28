import java.io.IOException;
import java.util.Scanner;
public class nsum
	{
		public static void main(String args[])throws IOException
		{
			Scanner in = new Scanner(System.in);
			System.out.println("ENTER HOW MANY TIMES YOU WANT TO RUN: ");
			int n=in.nextInt();
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
