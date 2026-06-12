/*Write a java program to accept the height of a person in centimeters 
  and categorize the person according to their height.
              PerHeight < 150.0  : The person is Dwarf.
                                	 
              PerHeight >= 150.0 && PerHeight < 165.0  : The person is  average heighted.
                                	
              PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
 
              Test Data : 135
 
              Expected Output :
 
              The person is Dwarf.
                    	*/
 import java.util.*;
 public class PerHeight
 {
  public static void main(String x[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Test Data");
   float Data = sc.nextFloat();
   if(Data <150.0)
   {
   System.out.println("The person is Dwarf");
   }
   else if (Data >= 150.0 && Data<165)
   {
   System.out.println("The person is  average heighted");
   }
   else if (Data>=165.0 && Data <=195.0)
   {
   System.out.println("The person is taller");
   }
   else
   {
    System.out.println("Height out of range");
   }
  }
 }