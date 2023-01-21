import java.util.*;

 class SuperElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            hm.put(x[i],hm.getOrDefault(x[i],0)+1);
        }
        int  sum =0;
        int count =0;
        for(Map.Entry entry:hm.entrySet()){
            if((int)entry.getKey()==(int)entry.getValue()){
                sum += (int)entry.getKey();
                count++;
            }
        }
        if(count==0){
            System.out.print("-1");
        }
        else
        System.out.printf("%.2f",(float)sum/count);

    }
}
