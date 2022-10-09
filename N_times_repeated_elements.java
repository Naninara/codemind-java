import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,x[],y[],k,flag=0;
        n = sc.nextInt();
        x= new int[n];
        y= new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        k = sc.nextInt();
        int visited=-1;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(x[i]==x[j]){
                    count++;
                    y[j]=-1;
                    
                }
            }
            if(y[i]!=visited){
                y[i]=count;
                
                
            }
        }
        for(int i=0;i<n;i++){
            if(y[i]==k){
                System.out.print(x[i]+" ");
                flag=1;
            }
        }
        if(flag==0){
            System.out.print("-1");
        }
        
    }
}