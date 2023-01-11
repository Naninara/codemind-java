import java.util.*;
class MonkTeachesPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s = sc.nextLine();
            if(pali(s) & s.length()%2==1){
                System.out.println("YES ODD");
            }
            else if(pali(s) & s.length()%2==0){
                System.out.println("YES EVEN");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    private static boolean pali(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
