import java.util.Scanner;
class sample{
    public static int pali(int x)
    {
        int rev=0;
        while(x>0)
        {
            int r = x%10;
            rev = rev*10+r;
            x = x/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,result;
        n = sc.nextInt();
        if (n<0)
        {
            n=Math.abs(n);
        }
        result= pali(n);
        if(result==n)
            System.out.print("True");
        else
            System.out.print("False");
        
    }
}