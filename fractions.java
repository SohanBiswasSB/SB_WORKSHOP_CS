import java.io.IOException;
import java.util.*;
public class fractions
	{
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE FIRST FRACTION NUMBERS: ");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("THE FRACTION IS: "+a+"/"+b);
		System.out.println("ENTER THE SECOND FRACTION NUMBERS: ");
		int c=in.nextInt();
		int d=in.nextInt();
		System.out.println("THE FRACTION IS: "+c+"/"+d);
		int []ans=fact(a,b,c,d);
		System.out.println("THE SUM OF THE FRACTION IS: "+ans[0]+"/"+ans[1]);
	}	
	static int[] fact(int q, int w, int e, int r)
	{
		int[] ans = new int[2];
		ans[0]= (q*r)+(w*e);
		ans[1]= w*r;
		return ans;
	}
	
}
