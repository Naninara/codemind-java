//package numbers;

import java.util.Scanner;

class ElementsWithPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int oddCount=0;
		int x[]= new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		if(n%2==0) {
			for(int i=0;i<n;i++) {
			System.out.print(x[i]+" ");
		}
		}
		else {
			for(int i=0;i<n;i++) {
				System.out.print(x[i]+" ");
		}
			System.out.print("0");
		}

	}

}
