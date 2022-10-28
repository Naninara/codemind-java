import java.util.*;
class frequency {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	char x[]= s1.toCharArray();
	int y[] = new int[x.length];
	int n = x.length;
	int flag=0;
	for(int i=0;i<n;i++) {
		int count=1;
		for(int j=i+1;j<n;j++) {
			if(x[i]==x[j]) {
				count++;
				y[j]=-1;
			}
		}
		if(y[i]!=-1) {
			y[i]=count;
		}
		
	}
	for(int i=0;i<x.length;i++) {
		if(y[i]==1){
		    System.out.print(i);
		    flag=1;
		    System.exit(0);
		}
	}
	if(flag==0){
	    System.out.print(-1);
	}
	}

}
