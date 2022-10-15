import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,m,temp=0,count,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
             temp=i;
             count=0;
             while(temp!=0)
             {
                 r=temp%10;
                 if(r==0||i%r!=0)
                 {
                     count=1;
                     break;
                     
                 }
            temp=temp/10;
                 
             }
             if(count==0)
             {
                 System.out.print(i+" ");
                 
             }
        }
        
       
        
    }
}