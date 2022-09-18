import java.util.Scanner;
class Sample
{
    public static boolean prime(int n)
    {
        int count=0;
        if(n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==0){
            return true;
        }
        else
        return false;
    }
    public static boolean pali(int n)
    {
        //palindrome logic write here.
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
            return true;
        else
            return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(pali(i)&&prime(i))
            {
                System.out.print(i);
                break;
            }
        }
        
        
        
    }
}
