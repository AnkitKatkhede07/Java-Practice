public class TempCelsius
{
 public static void main(String x[])
 {
  float fah=Float.parseFloat(x[0]);//float commond line satement
  float cel=(fah-32)*5/9;
  System.out.println("Enter the temp :"+fah+"covert to cel:"+cel);
 }
}