import java.util.*;

class CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li1 = new ArrayList<>(n);
        for (int i = 0; i < n ; i++) {
            li1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        ArrayList<Integer> li2 = new ArrayList<>(m);
        for (int i = 0; i < m ; i++) {
            li2.add(sc.nextInt());
        }
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            li.add(li2.get(i),li1.get(i));
        }
        li.forEach((i)->System.out.print(i+" "));
    }
}

