import java.util.*;
class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            ArrayList<Integer> li = new ArrayList<>();
            for (int i = 0; i <n; i++) {
                li.add(sc.nextInt());

            }
            while(r-->0){
                li.add(0,li.get(li.size()-1));
                li.remove(li.size()-1);
            }
            String s ="";
            for(int ele:li){
                s = s+ele+" ";
            }
            System.out.println(s.trim());
        }
    }
}
