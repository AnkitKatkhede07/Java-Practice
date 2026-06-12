public class ExpectionApp 
{
  public static void main(String args[])
  {  try{
     String s = "Java";
   System.out.println(s.charAt(10));
   }
   catch(Exception ex){
	   System.out.println(ex);
   }
  finally{
  System.out.println("THis finally block");
  }
  }
}