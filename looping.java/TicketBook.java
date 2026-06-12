/*
 **7. Train Ticket Booking**

**Description:**

* Ask the user to select a seat number.
* If seat is already booked (use a sample booked seat list), **continue** to ask again.
* If the user enters "exit", **break** the loop.
* Use a do-while loop to keep asking until a valid seat is booked.*/
import java.util.Scanner;
class TicketBook
{
 public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
int[]booked={12,4,6,9,10,5,23,30};
int Totalseats=40;
String input;
do 
{
  System.out.println("\n===Train Ticket Booking====");
  System.out.println("Enter seat number (1-"+Totalseats+")or type'exit':");
  input=sc.next();
  if(input.equalsIgnoreCase("exit")){
  System.out.println("Exiting without booking .Goodbye!");
  break;
  }
  int seat=Integer.parseInt(input);
 if (seat < 1 || seat > Totalseats) 
   {
    System.out.println("Invalid seat number. Try again.");
                continue;
    }
	boolean isBooked = false;
            for (int s : booked) {
                if (s == seat) {
                    isBooked = true;
                    break;
					}
					}
	if (isBooked) {
	System.out.println("Seat " + seat + " is already booked. Choose another.");
                continue;
            } else {
			System.out.println("Seat " + seat + " successfully booked!");
                break; // exit after booking
            }	
}while(true);
sc.close();
}
 }

