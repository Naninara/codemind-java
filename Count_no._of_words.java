import java.util.*;
 class str{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int word_count=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if (ch==' ')
            word_count++;

        }
        System.out.println((word_count+1));
}

}