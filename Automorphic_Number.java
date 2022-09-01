import java.util.*;
class automorphic {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,s,l;
    n=sc.nextInt();
    s=n*n;
    l=(int)Math.log10(n)+1;
   int r=s%(int)Math.pow(10,l);
    if (r==n)
    {
        System.out.println("Automorphic Number");
    }
    else
    {
        System.out.println("Not an Automorphic Number");
    }
    }
}
