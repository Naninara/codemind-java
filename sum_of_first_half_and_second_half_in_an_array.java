
//package numbers;

import java.util.Scanner;

 class DiffBwHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x[]= new int[n];
		int a[]= new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		int fh=0,sh=0;
		if(n%2==0) {
		for(int i=0;i<n/2;i++) {
			fh=fh+x[i];
		}
		
		for(int i=n-1;i>=n/2;i--) {
			sh=sh+x[i];
			
		}
		System.out.println(fh);
		System.out.println(sh);
		}
		else {
			for(int i=0;i<n/2;i++) {
				fh=fh+x[i];
			}
			
			for(int i=n-1;i>=n/2;i--) {
				sh=sh+x[i];
				
			}
			System.out.println(fh);
			System.out.println(sh);
		}

	}

}



