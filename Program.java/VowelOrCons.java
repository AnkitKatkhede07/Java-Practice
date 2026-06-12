/*Write a program to input a character and check whether it is a vowel or 
consonant using a switch case.
Explanation:
 Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; 
 default for consonant.
 */
 import java.util.*;
 public class VowelOrCons
 {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a case character");
	int ch=sc.next().charAt(0);
	switch(ch)
	{
   ch = Character.toLowerCase(ch);
	case 'a':
    case 'e':
	case 'i':
    case 'o':
	case 'u':
	 System.out.println("vowel");
	break;
	default :
	if (Character.isLetter(ch)) {
      System.out.println(ch + " is a consonant.");
    } else {
     System.out.println("Invalid input. Please enter a letter.");
           }
	}
  }
 }
