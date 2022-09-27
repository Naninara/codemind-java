import java.util.*;
class sample{
    public static boolean cnt(int n){
        int cnt=0;
        while(n>0){
            int r = n%10;
            cnt++;
            n = n/10;
        }
        if(cnt%2==0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x[],cnt=0;
        n = sc.nextInt();
        x = new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(cnt(x[i]))
                cnt++;
        }
        System.out.print(cnt);
            
    }
}