import java.util.*;
 class ipadress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='.') {
				System.out.print("[.]");
			}
			else
				System.out.print(s1.charAt(i));
		}

	}

}
