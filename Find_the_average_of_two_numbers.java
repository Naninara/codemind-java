import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        float a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        float av;
        av=((a+b)/2);
        System.out.format("%.4f",av);
    }
}