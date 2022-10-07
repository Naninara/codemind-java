import java.util.Scanner;
class smap{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int x[],cnt=0;
        int n = sc.nextInt();
        x = new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(x[i]>1){
                cnt++;
                if(cnt>1) break;
            }
        }
        if(cnt>=1){
            System.out.print("False");
        }
        else
        System.out.print("True");
        
    }
}