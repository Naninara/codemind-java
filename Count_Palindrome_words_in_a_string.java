import java.util.*;
 class PaliWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
           
            if(pali(words[i])){
                count++;
            }
        }
        System.out.println(count);
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
