import java.util.Scanner;
class root
{
    public static boolean prime(int n){
        if(n==1)
        return false;
        int cnt =0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if((n%i)==0)
                cnt++;
        }
        if(cnt==0)
        return true;
        else
        return false;
    }
    public static boolean pali(int n){
        int rev=0;
       int temp=n;
        while(n>0){
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
	public static void main(String args[])
	{
		int n,a,b;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(int i=n+1;;i++){
		    if(pali(i) && prime(i)){
		        a = i;
		        break;
		        
		    }
		}
		
		System.out.print(a);
		
		}
	
}