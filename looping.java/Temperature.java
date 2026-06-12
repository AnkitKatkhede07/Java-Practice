/*
**6. Temperature Logger**

**Description:**

* Ask the user to enter daily temperatures.
* Use **continue** if the entered temperature is negative (invalid reading).
* Use **break** if the user enters "stop".
* Keep looping with do-while until break condition.*/
import java.util.*;
public class Temperature
{
 public static void main(String []args)
 {
   Scanner sc = new Scanner(System.in);
   String temp;
   int sum=0;
   int count=0;
   do{    
   System.out.print("Enter a temperature(or type 'Stop'):");
   temp=sc.next();
   //int degree=0;
   if(temp.equalsIgnoreCase("Stop"))
   {
    break;
   }
   
   int input=Integer.parseInt(temp);//int seat=Integer.parseInt(input);
   if(input<0)
   {
   System.out.println(" temperature is negative (invalid reading)");
   continue;
   }
   sum+=input;
   count++;
   System.out.println("Record :"+temp+"C");
   
   }while(true);
   if(count>0){
   double avg =(double)sum/count;
   System.out.println("Total Readings: " + count);
   System.out.println("Average Temperature: " + avg);
   }
  else 
  {
   System.out.println("\nNo valid temperature readings recorded.");
   }
 }
}
