
import java.util.*;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x[],avg=0,cnt=0;
        n = sc.nextInt();
        x = new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
             avg=avg+x[i];}
        avg = (int)avg/n;
        
        for(int i=0;i<n;i++){
            if(x[i]<=(avg) )cnt++;
        }
        System.out.print(cnt);
   
}
}