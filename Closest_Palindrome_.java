import java.util.Scanner;
class root
{
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
		    if(pali(i)){
		        a = i;
		        break;
		        
		    }
		}
		for(int i=n-1;;i--){
		    if(pali(i)){
		         b = i;
		        break;
		        
		    }
		}
		if((n-a)<(b-n))
		System.out.print(b);
		else if((b-n)<(n-a))
		System.out.print(a);
		else
		System.out.print(b+" "+a);
		
		}
	
}