import java.util.*;
public class Main
{
  public static void main(String argss[])
  {
    Object obj []=new Object [7];
obj[0]='a';
obj[1]=12.4;
obj[2]=123f;
obj[3]=3403403404L;
obj[4]="ankit";
obj[5]=false;
obj[6]=new java.util.Date();

   for( Object o : obj)
   {
    System.out.println(o);
   }
  }
}