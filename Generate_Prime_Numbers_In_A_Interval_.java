import java.util.*;
class sample{
    public static boolean prime(int n){
        int cnt=0;
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt==0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n;i<m;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}