import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[]= new int[n];
        int k[]= new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(x[i]!=0){
                k[j]=x[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(k[i]+" ");
        }
    }
}