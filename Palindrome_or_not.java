import java.util.*;
class PaliWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(pali(s)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }

    private static boolean pali(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        }
        return true;
    }
}
