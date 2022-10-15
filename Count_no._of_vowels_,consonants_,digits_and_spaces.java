import java.util.Scanner;
class sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        int v=0,cs=0,sp=0,no=0;
    String vowel="AEIOUaeiou";
    String number="0123456789";
    String space =" ";
    for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
         if(vowel.contains(ch+""))
            v++;
        else if(number.contains(ch+""))
            no++;
        else if(space.contains(ch+""))
            sp++;
        else
          cs++;  
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+cs);
        System.out.println("Digits: "+no);
        System.out.println("White spaces: "+sp);
    }
    }