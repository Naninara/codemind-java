
import java.util.*;
class kelementsinarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k,x[],y[];
		n = sc.nextInt();
		x = new int[n];
		for(int i=0;i<n;i++) {
		   	x[i]=sc.nextInt();
		   	x[i]=Math.abs(x[i]);
		   	
			
			
		}
		for(int i=0;i<n;i++) {
		if(x[i]!=0)
		System.out.print((int)(Math.log10(x[i])+1)+" ");
		else
		System.out.print(1+" ");
		}
		
	}
	
}
