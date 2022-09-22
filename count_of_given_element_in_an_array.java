import java.util.Scanner;
class mmm{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,x[],m,cnt=0;
        n = sc.nextInt();
        x= new int[n];
        
        
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        m = sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(x[i]==m)
            {
               cnt++;
            }
        }
        System.out.print(cnt);
    }
}