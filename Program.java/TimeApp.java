//write a java program to convert seconds to hours,minutes and seconds?
import java.util.*;
public class TimeApp
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a num seconds");
   int sec=sc.nextInt();
   int hours=sec/3600;
   int remaningSecondsafterhours=sec%3600;
   int minutes=remaningSecondsafterhours/60;
   int seconds=remaningSecondsafterhours%60;
   System.out.printf("Time:%02d:%02d:%02d%n",hours,minutes,seconds);
   //System.out.printf("Time:%02d:%02d:%02d%n",hours,minutes,seconds);
   
 }
}