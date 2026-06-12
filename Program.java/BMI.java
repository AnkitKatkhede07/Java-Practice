public class BMI//Body mass Index
{
public static void main(String x[])
  { 
    double Height=Double.parseDouble(x[0]);
	double weight=Double.parseDouble(x[1]);
	double BMI=weight / (Height*Height);
	System.out.println("the value:"+BMI);
  }
}