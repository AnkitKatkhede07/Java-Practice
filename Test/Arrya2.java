import java.util.*;
public class Arrya2
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 int m=sc.nextInt();
	 if(m<1||m>12)
	 {
	    System.out.println("Invaild Month ReEnter....");
	 }
	 else
	 {
	    if(m>=3&&m<=5)
		{
		   System.out.println("THIS SEASON: Spring");
		}
		else if(m>=6&&m<=8)
		{
		System.out.println("THIS SEASON: Summer");
		}
		else if(m>=9&&m<=11)
		{
		  System.out.println("THIS SEASON: Autumn");
		}
		else 
		{
		  System.out.println("THIS SEASON: Winter");
		}
	 }
  }
}