import java.util.*;
public class StringApp
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a string here");
	 String str=sc.nextLine();
	 String rev= "";
	 String s=str;
	 for(int i=s.length()-1;i>=0;i--)
	 {
	    rev+=s.charAt(i);
	 }
	if(str===rev)/* (str.equals(rev)) */
	{
	System.out.println("palindromedrome");
	}
	else
	{
	  System.out.println("not palindrome");
	}
  }
  
}
/* boolean isPalindrome = true;

for (int i = 0; i < str.length() / 2; i++) {
    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        isPalindrome = false;
        break;
    }
}

if (isPalindrome) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
} */