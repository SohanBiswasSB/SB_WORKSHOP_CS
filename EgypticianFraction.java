import java.util.Scanner;
public class EgypticianFraction
{
	static int n;
	static int lcm;
	public EgypticianFraction(int x)
	{
		n=x;
	}
	static int findlcm(int y)
	{
		int x=1;
		lcm=(x>y)?x:y;
		while(true)
		{
			if(lcm%x==0 && lcm%y==0)
				break;
			++lcm;
		}
		return lcm;
	}

	static int upper(int y)
	{
		int sum=0;
		sum+=lcm/y;
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO RUN: ");
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER THE THE NUMBER OF FRACTION: ");
			int nf=in.nextInt();
			int totalsum=0;
			for(int j=0;j<nf;j++)
			{
				System.out.println("ENTER THE THE DENOMNATOR VALUES: ");
				int den=in.nextInt();
				System.out.println("THE SUM FOR "+1+"/"+den+" IS :");
				findlcm(den);
				totalsum+=upper(den);
			}
			System.out.println("THE SUM IS: "+totalsum+"/"+lcm);
		}
		in.close();
	}
}
