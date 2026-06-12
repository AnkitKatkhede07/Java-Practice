public class  
{
public static void show(int x)
{
  if(x==0)
  {
  System.out.println("End");
  //return 0;
  }
  else
  {
   System.out.println("Good Morning"+x);
     show(x-1);
  }
}
  
  public static void main(String[]args)
  {
     show(5); 

  }

}