
import java.util.*;
class isdigit {
	public static boolean isdigit(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'0' || s.charAt(i)>'9') {
				return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    sc.nextLine();
	while(n>0){
	   String s1 = sc.nextLine();
	if(isdigit(s1)) {
		System.out.println("True");
	}
	else
		System.out.println("False");
	
	
	n =n-1;
	}
	
	}

}
