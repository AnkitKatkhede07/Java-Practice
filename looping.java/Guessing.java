/*4. Number Guessing Game**

**Description:**

* System generates a random number between 1–100.
* Use a do-while loop to let the user guess the number.
* If guess is too high or low, give a hint and **continue**.
* If the guess is correct, print "You guessed it!" and **break*/
import java.util.Scanner;
public class Guessing
{
 public static void main(String[]args)
 {
 Scanner sc= new Scanner(System.in);
 int num=100;
 int Gustnum;

 do{
 System.out.println("Enter a Guessing number");
  Gustnum=sc.nextInt();
 
 if(Gustnum==num){
    System.out.println("You guessed it!");
	break;
  }
  if(Gustnum<=num)
  {
   System.out.println("The Guessing is Low");
   continue;
  }
  else
  {
    System.out.println("The Guessing is high");
	
	continue;
  }
   }while(num>=num);
 }
}

