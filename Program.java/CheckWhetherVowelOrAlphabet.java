//Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class CheckWhetherVowelOrAlphabet
{
  public static void main(String x[])
  {
	  char ch;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Alphabet");
	 ch=sc.nextLine().toLowerCase().charAt(0);
	String str=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"It is vowel":"It is consonant";
	System.out.println(str);
  }
}