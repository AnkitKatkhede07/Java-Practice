/*Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Explanation:
 Use switch with multiple cases falling through for weekdays and weekends.*/
 import java.util.*;
 public class Weekday
 {
   public static void main(String []args)
   {
    Scanner sc = new Scanner(System.in);
	System.out.println("the day type for an input day number (1-7)");
	int day=sc.nextInt();
	switch(day)
	{
	case 1:
	System.out.println("Monday");
	case 2:
    System.out.println("Tusday");
	case 3:
	System.out.println("Wednesday");
    case 4:
	System.out.println("Thuesday");
    case 5:
	System.out.println("Friday");
  System.out.println("Weekday");
 break;
 case 6:
 System.out.println("Saturday");
 case 7:
 System.out.println("Sunday"); 
 System.out.println("Weekday");
 break;
 default :
 System.out.println("Invaild case plz recorect cases");
	}
   }
 }
