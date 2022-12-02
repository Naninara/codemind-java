import java.util.*;
class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        for(int i=1;;i++){
            if(!li.contains(i)){
                System.out.print(i);
                System.exit(0);
            }
        }
    }
}