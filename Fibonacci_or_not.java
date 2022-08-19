import java.util.Scanner;
class root
{
	public static void main(String args[])
	{
		int a=0,b=1,c,n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		c=a+b;
// 		System.out.print(a+" "+b+" ");
		while (c<n)
		{
		  //  System.out.print(c+" ");
		    a=b;
		    b=c;
		    c=a+b;
		}
		if(n==c)
		{
		    System.out.println("True");
		}
		else
		{
		    System.out.println("False");
		}
		
	}
	
}