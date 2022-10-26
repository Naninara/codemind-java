import java.util.*;
 class arraystringreverseword {
	public static String rev(String s) {
		String r ="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			r= ch+r;
		}
		return r;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			String word[]= s1.split(" ");
			for(int i=0;i<word.length;i++) {
				if(i%2==0)
				System.out.print(rev(word[i])+" ");
				else
					System.out.print((word[i])+" ");
			}
			
	}

}
