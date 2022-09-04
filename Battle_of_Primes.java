import java.util.*;
class NextPrime
{
  public static boolean isPrime(int n)
  {
     int count=0;
	 for(int i=2;i<=(int)Math.sqrt(n);i++)
	 {
	    if(n%i==0)
		  count++;
	 }
	 if(count==0)
	    return true;
	 else
	    return false;
  }
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n,i;
         n=sc.nextInt();
         int n1=sc.nextInt();
         int t=n+n1;
         int t2=t+1;

	 for(i=t2;;i++)
	 {
	     if(isPrime(i))
		 {
		   System.out.print(i-t);
                   break;
		 }
	 }
	
  }
  
}
