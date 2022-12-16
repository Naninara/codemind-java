//package Problems;
import java.util.*;
class unique{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        ArrayList<Integer> p = new ArrayList<>();
        int cnt=0;
        for(int ele:li){
            if(!p.contains(ele) && ele%2==0){
                cnt++;
                p.add(ele);
            }
        }
        System.out.print(cnt);
        
        
	}

}
