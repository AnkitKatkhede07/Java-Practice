public class Re
{
public static void main (String args[])
{ 
    display(5);
}
public static void display(int n)
{
   if(n==0)
{
      System.out.println("End");

}
else
{
   System.out.println(" GOOD morning");
  display(-- n);
}
}
}