public class AreaOfEquilateral
{
  public static void main(String x[])
  {
	  int side=Integer.parseInt(x[0]);
    //int a=2*2;
	//double sq=Math.sqrt(3);
	//double sqr=Math.pow(2,2);//findoutnumber,how many power)--->
	//area=sqrt(3)/4*side*side;
	double area=(Math.sqrt(3)/4)*(side*side);
	System.out.println("Area of Equilateral triangle :" + area);
	
  }
}