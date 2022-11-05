//package numbers;
import java.util.*;
class MInimumandMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x[]= new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		int c=0;
		int y=0;
		for(int i=0;i<n;i++) {
			if(x[i]==-1) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(x[i]==x[j]) {
					x[j]=-1;
					count++;
				}
			}
			if(count==x[i]) {
				x[c]=count;
				c++;
				y=1;
			}
			
		}
		if(y==0) {
			System.out.print(-1);
		}
		else {
			int max=x[0];
			int min = x[0];
			for(int i=0;i<c;i++) {
				min = Math.min(min, x[i]);
				max = Math.max(max, x[i]);
			}
		System.out.print(min+" "+max);	
		}

	}

}
