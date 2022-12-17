
import java.util.Scanner;

 class PlayWithDigits {
    static int digitSum(int n){
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();

        }
        for (int i:x) {
            System.out.print(digitSum(i)+" ");    
        }
        
    }
}
