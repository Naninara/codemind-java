import java.util.*;
class reversestring {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s1 = sc.nextLine();
	String word[]= s1.split(" ");
	for(int i=0;i<word.length/2;i++){
	  String s= word[i];
	  word[i]=word[word.length-i-1];
	  word[word.length-i-1]=s;
	   
	}
	for(int i=0;i<word.length;i++){
	    System.out.print(word[i]+" ");
	}
	sc.close();
		

	}

}
