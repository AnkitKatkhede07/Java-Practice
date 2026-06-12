/*
Q7. Write a Java program to calculate electricity bill using the following conditions:
Units ≤ 100 → ₹1.5/unit
101–200 → ₹2/unit
201–300 → ₹3/unit
Above 300 → ₹5/unit
*/
import java.util.*;
public class  electricitybill
{
 public static void main(String x[])
{
  Scanner sc= new Scanner(System.in);
 System.out.println("Enter units from User:");
double unit=sc.nextDouble();
if(unit<=100)
{
 double total=unit*1.5;
  System.out.println(" electricity bill is : "+total);
}
else if(unit>101&&unit<=200)
{
double total=unit*2;
  System.out.println(" electricity bill is : "+total);
}
else if(unit>201&&unit<=300)
{
 double total=unit*3;
  System.out.println(" electricity bill is : "+total);

}else
{
  double total=unit*5;
  System.out.println(" electricity bill is : "+total);

}


}
}