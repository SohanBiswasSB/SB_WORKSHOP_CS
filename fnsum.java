import java.io.IOException;
import java.util.*;
public class fnsum
	{
		public static void main(String args[])throws IOException
		{
			Scanner in = new Scanner(System. in);
			System.out.println("ENTER 2 NUMBERS: ");
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println("SUM IS: "+fsum(a,b));
		}
		static int fsum(int x, int y)
		{
			int sum=x+y;
			return sum;
		}
	}
