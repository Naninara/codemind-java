import java.util.*;
class syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int n = sc.nextInt();
        int temp=1;
        while(n>0)
        {
            System.out.println(t+" "+"x"+" "+temp+" "+"="+" "+(temp*t));
            n = n-2;
            temp=temp+2;
            
        }
            
        
        
        
    }
    
}
