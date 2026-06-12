public class DisplayCube
{
 public static void main(String x[])
 {
 //num of cude input
  int num=Integer.parseInt(x[0]);
  //calculate the cube of the number
  long cube =(long) num*num*num;
  System.out.printf("the number of cube:" +num+"is :"+cube);
 }
}