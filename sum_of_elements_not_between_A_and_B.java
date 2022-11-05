//package numbers;
import java.util.*;
class MinimumBwAandB {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int x[]= new int[n];
	for(int i=0;i<n;i++) {
		x[i]=sc.nextInt();
	}
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c=0;
	int y=0;
	for(int i=0;i<n;i++)
		if(x[i]<a || x[i]>b ) {
			x[c]=x[i];
			c++;
			y=1;
		}
	    int cnt=0;
		for(int i=0;i<c;i++) {
			cnt =cnt+x[i];
		}
	System.out.print(cnt);
	

}
}
