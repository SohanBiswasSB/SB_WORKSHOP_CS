import java.io.IOException;
import java.util.*;
class Rectangle
{
	public static void main(String args[])throws IOException
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO RUN: ");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("ENTER THE "+i+" SET OF INPUTS IN THE ORDER OF (X,Y): ");
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			double x3=in.nextDouble();
			double y3=in.nextDouble();
			double [] x_coordinates = {x1,x2,x3};
		  double [] y_coordinates = {y1,y2,y3};
		  printarea(x_coordinates, y_coordinates);
		}
	}

	private static void printarea(double []X, double []Y)
	{
		System.out.println("THE AREA OF THE TRIANGLE WITH COORDINATES IS: "+ Math.abs(X[0]*(Y[1]-Y[2]) + X[1]*(Y[2]-Y[0]) + X[2]*(Y[0]-Y[1])));
	}
}
