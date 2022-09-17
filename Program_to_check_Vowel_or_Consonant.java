import java.util.*;
class VowelorNot
{
  public static void main(String args[])
  {
     char ch;
	 Scanner sc=new Scanner(System.in);
	 ch=sc.nextLine().charAt(0);
	 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  )
	    {System.out.println("Vowel");}
	 else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	   {System.out.println("Vowel");}
	 else
	   { System.out.println("Consonant");}
	 sc.close();
  }
}
