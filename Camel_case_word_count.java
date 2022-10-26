import java.util.Scanner;
class Camelcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count =0;
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if((int)ch>=65 && (int)ch<=91) {
				count++;
			}
		}
		if((int)s1.charAt(0)>91){
		    System.out.print(count+1);
		}
		else
		     System.out.print(count);

	}

}
