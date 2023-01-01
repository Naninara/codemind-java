import java.util.Arrays;
import java.util.Scanner;

 class anagram2 {
	public static boolean anigram(String s1,String s2) {
	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length)
			return false;
		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		
		String s2 = sc.nextLine();
		
		if (anigram(s1,s2))
		{
		System.out.print("True");
		}
		else
			System.out.print("False");
	}
}
