import java.util.*;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x[],c=0;
        n = sc.nextInt();
        x = new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++)
                {
                    if(x[j]<x[i])
                    cnt++;
                }
           System.out.print(cnt+" ");
            
            
        }
        // if((x.length-c)==x.length)
        //         System.out.print(-1);
    }
}