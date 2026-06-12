/* constructor channing using this */
class C
{
  C()
  { this(5);
     System.out.println("I am Default Constructor");
  }
  C(int x)
  {
   this(5.5f);
    System.out.println("I am Interger paramter Constructor"+x);
  }
  C(float x)
  {
    System.out.println("I am Float Constructor"+x);
  }
}
public class CApp
{
 public static void main(String args[])
 {
   C c1=new C();
 }
}