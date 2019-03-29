import java.io.IOException;
import java.util.*;
import java.math.*;
public class rectarea
	{
		public static void main(String args[])throws IOException
		{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO RUN: ");
			int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println("ENTER THE "+i+" SET OF INPUTS");
				double a=in.nextDouble();
				double b=in.nextDouble();
				double c=in.nextDouble();
				double d=in.nextDouble();
				double e=in.nextDouble();
				double f=in.nextDouble();
				double length1=length(a,b,c,d);
				double length2=length(c,d,e,f);
				double length3=length(a,b,e,f);
				System.out.println("THE AREA OF THE RECTANGLE WITH VERTICES: ("+a+","+b+"), ("+c+","+d+"), ("+e+","+f+") is: "+findpytha(length1,length2,length3));
			}
		}
		public static double length(double a,double b,double c,double d)
		{
			return Math.sqrt(Math.pow(a, c)+Math.pow(b, d));
		}
		public static double area(double x,double y)
		{
			double area=x*y;
			return area;
		}
		public static double findpytha(double a,double b,double c)
		{
			if((a>b) && (b>c))
				return area(a,b);
			else if((b>c) && (c>a))
				return area(b,c);
			else
				return area(a,c);
		}
		
	}
