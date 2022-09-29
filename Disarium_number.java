import java.util.*;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        n = sc.nextInt();
        int m=n;
        int l = (int)Math.log10(n)+1;
        
            while(n>0 && l>0){
                int r = n%10;
                
               sum = sum+(int)Math.pow(r,l);
               n=n/10;
               l = l-1;
            
        }
       
        if(sum==m)
        System.out.print("True");
        else
        System.out.print("False");
    }
}