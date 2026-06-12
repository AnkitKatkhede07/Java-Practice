//Q56. Given (x, y), print quadrant I, II, III, IV or "Axis".
import java.util.*;
public class Q56
{
 public static void main(String []args)
 {
 int x,y;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a X");
   x=sc.nextInt();
   System.out.println("Enter a Y");
   y=sc.nextInt();
   String Axis=(x>0&&y>0)?"I":
   (x<0&&y>0)?"II":
   (x<0&&y<0)?"III":
   (x>0&&y<0)?"IV":
   "this not quadrant";
   System.out.println("Quadrant:"+Axis);
   
 }
}