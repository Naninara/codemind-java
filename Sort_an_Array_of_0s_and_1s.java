import java.util.*;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x[],t[];
        n = sc.nextInt();
        x = new int[n];
        t = new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(x[i]==0){
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++){
            t[i]=0;
        }
        for(int i=cnt;i<x.length;i++)
        t[i]=1;
        for(int i=0;i<n;i++)
        System.out.print(t[i]+" ");
    }
    
}