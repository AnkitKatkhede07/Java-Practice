public class Overloading 
{
  protected void show()
	 {
	   System.out.println("I am 1st show");
	 }
    
	 void show(int x)
	 {
	   System.out.println("I am 2st show");
	 }
	  public static void main (String args[])
     {
		 Overloading O =new Overloading();
		 O.show();
		 O.show(5);
      }
}
class Demo extends Overloading
{
	
}