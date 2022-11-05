//package numbers;

import java.util.Scanner;

class FirstAndLastPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int oddCount=0;
		int arr[]= new int[n];
		int a[]= new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=n/2;
		int c=0;
		int d=0;
		for(int i=0;i<k;i++) {
			a[c]=arr[i];
			c++;
		}
		for(int i=n-1;i>=k;i--) {
			b[d]=arr[i];
			d++;
		}
		if(n%2==0) {
			for(int i=0;i<c;i++) {
				System.out.print(a[i]+" "+b[i]+" ");
			}
		}
		else {
			for(int i=0;i<c;i++) {
				System.out.print(a[i]+" "+b[i]+" ");
			}
			System.out.print(b[k]);
			System.out.print(" "+"0");
		}

	}

}


