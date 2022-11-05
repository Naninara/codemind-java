//package numbers;
import java.util.*;
class uniqueoddelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int y=0;
		int oddCount=0;
		int x[]= new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(x[i]==x[j]) {
					count++;
					y=1;
				}
			}
			if(count==0) {
				if(x[i]%2!=0){
					oddCount++;
				}
			}
		}
		System.out.print(oddCount);
	}

}
