//package numbers;
import java.util.*;
class SumUptoK {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x[]= new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			if(x[i]%2!=0) {
				sum=sum+x[i];
			}
			else
				break;
		}
		System.out.print(sum);
	}
}
