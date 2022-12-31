import  java.util.*;
class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            li.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            int d =(Collections.frequency(li,li.get(i)));
            if(d>(n/2)){
                System.out.println(li.get(i));
                System.exit(0);
            }
        }
    }
}
