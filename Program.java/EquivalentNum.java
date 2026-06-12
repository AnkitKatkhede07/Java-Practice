/*Q56. Create a Java program using switch to convert a given number (1-5) to 
its word equivalent (One, Two, ..., Five). If the number is not between 1 and 5, 
display “Invalid number”.
Explanation:
 Switch with cases 1 to 5; default to handle invalid numbers.*/
 import java.util.*;
 public class EquivalentNum
 {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter with cases 1 to 5");
	int choise=sc.nextInt();
	switch(choise)
	{
	case 1:
	System.out.println("one");
	break;
	case 2:
	System.out.println("tow");
	break;
	case 3:
	System.out.println("three");
	break;
	case 4:
	System.out.println("four");
	break;
    case 5:
	System.out.println("five");
	break;
	default :
	System.out.println(" handle invalid numbers.");
	}
  }
 }
