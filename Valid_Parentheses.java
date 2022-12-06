import java.util.*;
class sample{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
       String s1 = sc.nextLine();
        boolean b = valid(s1);
        if(b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        } 
    }
    static boolean valid(String s2){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='('){
                s.push(')');
            }
            else if(s2.charAt(i)=='{')
                s.push('}');
            else if(s2.charAt(i)=='['){
                s.push(']');
            }
            
               else if (s.isEmpty() || s.pop()!=s2.charAt(i)){
                   return false;
               }
            
        }
        return s.isEmpty();
    }
}