import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,t,rev=0,r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        t=a;
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        System.out.println(rev);
    }
}