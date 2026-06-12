public class ConvertMinSecond
{
public static void main(String x[])
{
//totalseconds input line
 int totalseconds=Integer.parseInt(x[0]);
 //calculate hours formula
 int hours = totalseconds/3600;
 //calculate remaning seconds after extracting hours
 int remaningSecondsAfterHours=totalseconds%3600;
 //calculate minutes from the remaining seconds
 int minutes=remaningSecondsAfterHours / 60;
 //calculate remaining seconds after extracting minutes
 int seconds=remaningSecondsAfterHours%60;
 //print the result in hh:mm:ss formate
 System.out.printf("Time:%02d:%02d:%02d%n",hours,minutes,seconds);
 
}
}