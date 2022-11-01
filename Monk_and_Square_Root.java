import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        long y=-1,k;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            long m=sc.nextLong();
            y=-1;
            for(k=0;k<m;k++)
            {
                if((k*k)%m==n)
                {
                    y=k;
                    break;
                }
            }
            System.out.println(y);
            t--;
        }
    }
}