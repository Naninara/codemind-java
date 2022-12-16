import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=1;i<(n-1);i++){
            if((x[i-1]%2==0 && x[i+1]%2==1) || (x[i-1]%2==1 && x[i+1]%2==0)){
                cnt++;
            }
        }
        System.out.print(cnt);
        
    
    }
}