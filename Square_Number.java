import java.util.Scanner;
class root
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		n = sc.nextInt();
		double d=Math.sqrt(n);
		if((double)d -(int)(d)>0)
		   {
		       System.out.println("False");
		   }
		else
		   {
		       System.out.println("True");
		   }
	}
}