import java.util.*;
class array3 {
    public static boolean pali(int n)
   
    {
        int temp=n;
         int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int x[],n,m,cnt=0;
   n = sc.nextInt();

   x =new int[n];
   for( int i=0;i<n;i++)
   {
    x[i]=sc.nextInt();

   }
   
    for( int i=0;i<n;i++)
    {
     if(pali(x[i]))
        cnt++;
    }
    System.out.print(cnt);
}
}
