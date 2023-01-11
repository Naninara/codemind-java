import java.util.*;
class NumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                sum = sum+Integer.parseInt(s.charAt(i)+"");
            }
        }
        System.out.println(sum);
    }
}
