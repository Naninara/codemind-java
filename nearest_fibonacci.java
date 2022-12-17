import java.util.*;
class fibocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b =1;
        while(b<=n){
            int temp =a;
            a=b;
            b=temp+a;
        }
        if(n-a<b-n){
            System.out.print(a);
        } else if (b-n<n-a) {
            System.out.print(b);
        }
        else
            System.out.print(a+" "+b);
    }
}
