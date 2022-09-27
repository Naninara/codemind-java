import java.util.*;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x[],c=0,t[];
        n = sc.nextInt();
        x = new int[n];
        t =  new int[n];
        for(int i=0;i<n;i++){
            x[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            x[i]=(x[i]*x[i]);
           }
        Arrays.sort(x);
        for(int i=0;i<n;i++){
            System.out.print(x[i]+" ");
        }
    }      
}