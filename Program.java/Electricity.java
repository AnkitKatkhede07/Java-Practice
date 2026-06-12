/*
Q7. Write a Java program to calculate electricity bill using the following conditions:
Units ≤ 100 → ₹1.5/unit
101–200 → ₹2/unit
201–300 → ₹3/unit
Above 300 → ₹5/unit
*/
import java.util.*;
public class Electricity
{
 public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter units from user");
double unit=sc.nextDouble();//choise
System.out.println("choise the case:");
int choise=sc.nextInt();
System.out.println("------------------choise Number of Case--------------------");
System.out.println("case 1:unit <=100*1.5");
System.out.println("case 2:unit101–200 → ₹2/unit");
System.out.println("case 3:unit201–300 → ₹3/unit");
System.out.println("case 4:Above 300 → ₹5/unit");
switch(choise)
{ 
case 1:
{
  if(unit<=100)
  {
    double total=unit*1.5;
   System.out.println("electricity bill is : "+total);
  }
else
{
System.out.println("plz select different case unit is greater than equal to 100");
  }
break;
}

case 2:
{
 if(unit>=101&&unit<=200)
{
  double total=unit*2;
   System.out.println("electricity bill is : "+total);

}
else
{
System.out.println("plz select different case unit is greater than equal to 200");

}
break;
}
case 3:
{
 if(unit>=201&&unit<=300)
{
  double total=unit*3;
   System.out.println("electricity bill is : "+total);

}
else
{
System.out.println("plz select different case unit is greater than equal to 200");

}
break;
}

case 4:
{
if(unit>=300)
{
 double total=unit*5;
   System.out.println("electricity bill is : "+total);

}
else
{
System.out.println("plz select different case unit is greater than equal to 300");

}
break;
}
default:
{
System.out.println("Select correct choice");
}

}

}
}