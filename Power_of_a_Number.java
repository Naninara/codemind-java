import java.util.*;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,k;
        n =  sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        System.out.print((int)((Math.pow(n,m))%k));
        
    }
}