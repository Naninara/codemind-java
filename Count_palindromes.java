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
        int n,result,cnt=0;
        n = sc.nextInt();
        int x[] = new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        for(int ele : x){
        if(pali(ele)==ele)
           cnt++;
    }
     System.out.print(cnt);
}
}