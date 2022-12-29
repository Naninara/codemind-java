import java.util.*;
class FrstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.print(li.indexOf(k)+" "+li.lastIndexOf(k));
    }
}
