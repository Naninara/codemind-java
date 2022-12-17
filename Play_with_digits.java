
import java.util.Scanner;

 class PlayWithDigits {
    static int digitSum(int n){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum+r;
            n=n/10;
        }
        return sum;
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
            sum = sum + digitSum(i);
        }
        System.out.println(sum);
    }
}
