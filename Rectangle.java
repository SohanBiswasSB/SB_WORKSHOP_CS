import java.io.IOException;
import java.util.*;
class Rectangle
{
	static void printarea(double []X, double []Y)
	{
		System.out.println("THE AREA OF THE TRIANGLE WITH COORDINATES IS: "+ Math.abs(X[0]*(Y[1]-Y[2]) + X[1]*(Y[2]-Y[0]) + X[2]*(Y[0]-Y[1])));
	}
	public static void main(String args[])throws IOException
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO RUN: ");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("ENTER THE "+i+" SET OF INPUTS IN THE ORDER OF (X,Y): ");
			double xcord[]=new double[3];
			double ycord[]=new double[3];
			for(int j=0;j<3;j++)
			{
				xcord[j]=in.nextDouble();
				ycord[j]=in.nextDouble();
			}
			printarea(xcord,ycord);
		}
		in.close();
	}
}
