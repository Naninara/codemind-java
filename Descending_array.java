import java.util.*;
class array3 {
   
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int x[],n,m,cnt1=0,cnt=0;
   n = sc.nextInt();

   x =new int[n];
   for( int i=0;i<n;i++)
   {
    x[i]=sc.nextInt();

   }
   
    for( int i=0;i<n-1;i++)
    {
        if(x[i]<x[i+1])
        {
            System.out.println("no");
            System.exit(0);
        }
    }
    System.out.println("yes");
}
}
