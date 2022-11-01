import java.util.Scanner;
import java.lang.Math;
class Minimum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[20];
        int c=0,r;
        while(n>0)
        {
            r=n%10;
            arr[c]=r;
            c++;
            n=n/10;
        }
        for(int i=c-1;i>=0;i--)
        {
            if(arr[i]==6)
            {
                arr[i]=9;
                break;
            }
        }
        for(int i=c-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}