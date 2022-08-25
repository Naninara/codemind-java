import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
         float a =(float)(3.14*(n*n));
        System.out.format("%.2f",a);
    }
}