public class InchConvertCentemiter
{
  public static void main(String x[])
  {
    double Length=Double.parseDouble(x[0]);
	double centimeter=Length * 2.54;
	System.out.println("Enter the Length:"+Length);
	System.out.println("this is centimeter value:"+centimeter+'cm');
  }
}