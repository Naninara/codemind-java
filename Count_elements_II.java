//package Problems;

import java.util.ArrayList;
import java.util.Scanner;

class CountElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> li1 = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            li1.add(sc.nextInt());
        }
        ArrayList<Integer> newl = new ArrayList<>();
        
        for(int ele:li) {
        	if(!li1.contains(ele)) {
        		newl.add(ele);
        	}
        }
        for(int ele:li1) {
        	if(!li.contains(ele)) {
        		newl.add(ele);
        	}
        }
        ArrayList<Integer> p = new ArrayList();
        for(int ele:newl){
            if(!p.contains(ele)){
                p.add(ele);
            }
        }
        System.out.print(p.size());
        
        
        

	}

}
