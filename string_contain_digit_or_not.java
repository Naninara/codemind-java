import java.util.Scanner;
class Camelcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count =0;
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if((int)ch>=48 && (int)ch<=57) {
				count++;
			}
		}
		if(count>0){
		    System.out.print("Contains "+count+" digit");
		}
		else
		     System.out.print("Doesn't contain digit");

	}

}
