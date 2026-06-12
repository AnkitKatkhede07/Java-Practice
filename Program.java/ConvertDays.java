public class ConvertDays
{
   public static void main (String x[])
   {
     int days=Integer.parseInt(x[0]);
	 int year=days/365;
	 int remainingdays=days%365;
	 int weeks=remainingdays/7;
	     days=remainingdays%7;
	 System.out.println("total year:" +year+ "total weeks:" +weeks+ "total days" +days);
   }
}
