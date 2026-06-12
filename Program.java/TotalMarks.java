// Write a java progarm to enter marks of five and percentage?
import java.util.*;
public class TotalMarks
{
  public static void main(String x[])
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a subject marks:");
   int marks=sc.nextInt();
   System.out.println("Enter marks of English:");
   int English=sc.nextInt();
   System.out.println("Enter marks of Marathi:");
   int Marathi=sc.nextInt();
   System.out.println("Enter marks of Histroy:");
   int Histroy=sc.nextInt();
   System.out.println("Enter marks of Hindi:");
   int Hindi=sc.nextInt();
   System.out.println("Enter marks of Mathamatic:");
   int Mathamatic=sc.nextInt();
   int totalmarks=(English+Marathi+Histroy+Hindi+Mathamatic);
   double percentage=(totalmarks*100)/marks;
   System.out.println("total subject marks :"+totalmarks);
   System.out.println("total percentage  marks:"+percentage);
   
  
   
  }
 };