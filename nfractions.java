import java.io.IOException;
import java.util.*;
public class nfractions
	{
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF FRACTIONS: ");
		int n=in.nextInt();
		if(n==0)
		{
			System.out.println("IT CANNOT BE 0, ENTER MORE THAN 0... ");
			System.exit(0);
		}
		int num[]=new int[n];
		int den[]=new int[n];
		int tden=0;
		int tnum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER THE FRACTION NUMBERS: ");
			num[i]=in.nextInt();
			den[i]=in.nextInt();
			System.out.println("THE FRACTION IS: "+num[i]+"/"+den[i]);
			if(n==1)
			{
				System.out.println("THE SUM OF THE FRACTION IS: "+num[i]+"/"+den[i]);
				break;
			}
		}
		upper(0,1,1);
		for(int i=0;i<n-1;i++)
			tden=lcm(den[i],den[i+1]);
		for(int i=0;i<n;i++)
			tnum=upper(num[i],den[i],tden);
		if(n>1)
		System.out.println("THE SUM OF THE FRACTION IS:"+tnum+"/"+tden);
		
	}
	static int lcm(int x, int y)
	{
		int lcm;
		lcm=(x>y)?x:y;
		while(true)
		{
			if(lcm%x==0 && lcm%y==0)
				break;
			++lcm;
		}
		return lcm;
	}
	static int num0=0;
	static int upper(int x, int y, int z)
	{
		int lcm=z;
		num0+=x*(lcm/y);
		System.out.println(num0);
		return num0;
	}
}
