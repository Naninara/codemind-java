
import java.util.*;
class splitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		int result =0;
		for(int i=0;i<s1.length();i++) {
		    char ch = s1.charAt(i);
			int as=(int)(ch);
			result = Math.max(result,as);
		}
		System.out.print((char)(result));
		sc.close();
	}

}
