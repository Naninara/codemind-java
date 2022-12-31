import java.util.*;
class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int[] y = new int[n];
        for(int i=0;i<n;i++){
            y[i]= sc.nextInt();
        }
        int q = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(x[i]<=q && y[i]>=q){
                count++;
            }
        }
        System.out.print(count);
    }
}