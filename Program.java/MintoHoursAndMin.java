public class MintoHoursAndMin
{
 public static void main(String x[])
 {
	 int seconds=Integer.parseInt(x[0]);
	 int hours=seconds/3600;
	 int rem=seconds%3600;
	 seconds=rem;
	 int min=seconds/60;
	 rem=min%60;
    System.out.println(hours+"hrs : "+min+"minutes : "+rem+"seconds");
 }
}