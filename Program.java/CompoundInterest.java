public class CompoundInterest
{
  public static void main(String x[])
  {
  double p=Integer.parseInt(x[0]);
  int annually =1;
  double r=Integer.parseInt(x[1]);
  int yn=Integer.parseInt(x[2]);
  int nt=Integer.parseInt(x[3]);
   double FutureValue =p*Math.pow(1+(r/yn),yn*nt);
   double CI=FutureValue-p;
   System.out.println("CompoundInterest..:"+CI);
   System.out.println("FutureValue...:" +FutureValue);
  }
  }