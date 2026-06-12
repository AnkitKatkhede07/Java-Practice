import java.util.Scanner;
public class Demo
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   int m=sc.nextInt();
   calFact(m);
  }
  public static void calFact(int val){
     int cude=val*val*val;
	System.out.println("Cude  "+cude);
  }
}