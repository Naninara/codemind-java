import java.util.Scanner;
class sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,x[],cnt=0,cnt1=0;
        n=sc.nextInt();
        x= new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(x[i]%2!=0){
                cnt1++;
            }
        }
        for(int i=0;i<n;i++){
            if(x[i]%2!=0 && i%2!=0)
            cnt++;
        }
        if(cnt1==cnt){
            System.out.print("True");
        }
        else
            System.out.print("False");
    }
}