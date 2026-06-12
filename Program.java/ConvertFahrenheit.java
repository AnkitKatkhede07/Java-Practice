public class ConvertFahrenheit
{
 public static void main (String x[])
 {
   float cel=Float.parseFloat(x[0]);//float commond line statment
   float fah=(cel*9/5)+32;
   System.out.println("enter temp of cel :"+cel+"this temp is fahrenheit :"+fah);
 }
}