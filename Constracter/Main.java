 final class Myutility
{
//1st step use constructor as private
  private Myutility()
  {
     System.out.println("I am private utility constructor");
  }
  //2nd method static 
  public static int add(int a, int b)
  {
     return a+b;
  }
  public static int square (int no)
  {
    return no*no;
  }
  
}
public class Main
{
 public static void main(String args[])
 {
    int sum=Myutility.add(5,5);
	int sq=Myutility.square(5);
	System.out.println(+sum);
	System.out.println(+sq);
 }
}