import java.util.Scanner;
class sample{
    public static boolean prime(int n){
        int count=0;
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count=0,n;
        n = sc.nextInt();
        for(int i=2;i*i<=n;i++){
            if(prime(i)){
                if(i*i<=n){
                    count++;
                }
            }
            
        }
        System.out.print(count);
        
    }
}
