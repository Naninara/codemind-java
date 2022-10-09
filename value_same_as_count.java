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
        int c=0;
        for(int i=0;i<n;i++){
            if(x[i]==y[i]){
                c++;
            }
        }
        System.out.print(c);
        // if(flag==0){
        //     System.out.print("-1");
        // }
        
    }
}