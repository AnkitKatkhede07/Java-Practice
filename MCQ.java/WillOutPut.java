/*. What will be the output?
 int x = 5;
x = x++ + ++x;
System.out.println(x);
A) 11
 B) 12
 C) 10
 D) 13
*/
public class WillOutPut
{
  public static void main(String []args)
  {
    int x=5;
	x=x++ + ++x;
	System.out.println(x);
  }
}