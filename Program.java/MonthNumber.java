/*. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
        	*/
  import java.util.*;
  public class MonthNumber
  {
   public static void main(String x[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Month number");
	 int num=sc.nextInt();
	 if (num==12||num==1||num==2)
	 {
	 System.out.println("Winter");
	 }
	 else if(num>=3&&num<=5)
	 {
	 System.out.println("Spring");
	 }
	 else if(num>=6&&num<=8)
	 {
	 System.out.println("Summer");
	 }
	 else if(num>=9&&num<=11)
	 {
	 System.out.println("Autumn");
	 }
	 else 
	 {
	 System.out.println("Invaild input");
	 }
   }
  }