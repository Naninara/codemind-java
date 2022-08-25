import java.util.Scanner;
class sma{
    public static void factorial(int x,int y,int z)
    {
        int count=0;
         for (int i=x;i<=y;i++)
         {
             if (i%z==0)
             
                 count=count+1;

         }
         System.out.println(count);
        
    }
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int a,b,c;
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      factorial(a,b,c);
      
    }
}