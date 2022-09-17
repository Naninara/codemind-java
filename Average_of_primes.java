import java.util.*;
class array3 {
    public static boolean isprime(int n)
    {
        int cnt=0;
        if(n<2)
        return false;
       for(int i=2;i<=(int)Math.sqrt(n);i++)
       {
         if(n%i==0)
         cnt++;
       }
       if(cnt==0)
       return true;
       else
       return false;
    }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int x[],n,m;
   float cnt=0,cnt1=0;
   n = sc.nextInt();
   x =new int[n];
   
   for( int i=0;i<n;i++)
   {
    x[i]=sc.nextInt();

   }
  
   
    for(int i=0;i<n;i++)
    {
     if(isprime(x[i]))
     {
        cnt++;
        cnt1=cnt1+x[i];
     }
    }
    System.out.format("%.2f",(cnt1/cnt));
}
}

