import java.util.*;
class Rotation{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    for(int i=0;i<n;i++){
        x[i] = sc.nextInt();
    }
    int max=0;
    int count = 0;
    for(int i=0;i<n;i++){
        if(x[i]==1){
            count++;
        }
        else{
            max = Math.max(max,count);
            count=0;
        }
    }
    max = Math.max(max,count);
    System.out.print(max);
}
}