/***10. Student Marks Entry**

**Description:**

* Keep asking for student marks in a do-while loop.
* If marks are negative, **continue** to skip and ask again.
* If "stop" is entered, **break**.
* Finally, display average marks of valid entries.*/
import java.util.*;
public class MarksEntry
{
 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
   int num=0;
   String Stop;
   int totalMarks=0;
  
	   do {
            System.out.print("Enter student marks (or 'stop' to end): ");
            Stop = sc.next();

            if (Stop.equalsIgnoreCase("stop"))
			{
                break; // exit the loop
            }
			int marks = Integer.parseInt(Stop);
			

            if (marks < 0) 
			{
             System.out.println("Negative marks ignored.");
              continue; // skip and ask again
            }

            totalMarks += marks;
            num++;
          }while(true);
		  if (num > 0) 
		  {
            double average = (double) totalMarks / num;
            System.out.println("Average marks of valid entries: " + average);
          }
		else 
		{
            System.out.println("No valid marks entered.");
        }
 }
}