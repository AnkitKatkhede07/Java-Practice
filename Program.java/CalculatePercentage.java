public class CalculatePercentage
{
  public static void main(String x[])
 {
  float totalmarks=500;
  int maths =   Integer.parseInt(x[0]);
  int english = Integer.parseInt(x[1]);
  int histroy = Integer.parseInt(x[2]);
  int marathi = Integer.parseInt(x[3]);
  int hindi =   Integer.parseInt(x[4]);
  //int=maths+english,histroy,marathi,hindi;
   int marksobtained =(maths+english+histroy+marathi+hindi);
   System.out.println("Total sum all subject...."  + marksobtained);
   double percentage=(marksobtained / totalmarks)*100;
   System.out.println("total percentage...:" +percentage );
 }
}