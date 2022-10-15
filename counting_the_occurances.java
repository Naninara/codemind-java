import java.util.*;
class stpattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String s1 = sc.nextLine();
		char c = sc.nextLine().charAt(0);
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch==c) {
				count++;
			}
		}
		if(count>=1) {
			System.out.print(count);
		}
		else
			System.out.print(-1);

	}

}
