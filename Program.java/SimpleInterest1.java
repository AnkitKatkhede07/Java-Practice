public class SimpleInterest1
{ 
  public static void main(String[]x)
  {
  
    int principalamount=Integer.parseInt(x[0]);
    int Rateofinterest=Integer.parseInt(x[1]);
    int timeperiodyear=Integer.parseInt(x[2]);
    int simpleInterest=(principalamount*Rateofinterest*timeperiodyear)/100;
	System.out.println("the simple interest" +simpleInterest);

  
  }


}