/* Q4. Store N strings in an ArrayList. Reverse each string manually and store in another Arraylist. 
Input: 3 
java 
code 
list 
Output : Reversed List: avaj edoc tsil  */
import java.util.*;
public class Q4
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter word number:");
	int n = sc.nextInt();//number of word size

	 ArrayList<String>list=new ArrayList<>();
   System.out.println("Enter a String size");
   for (int i = 0; i < n; i++)
     list.add(sc.next()); 
   for(String str:list){
   String rev=" ";
   
   for(int i=str.length()-1;i>=0;i--)
   {
	   rev+=str.charAt(i);
	    
   }System.out.print(rev);
   }   
   
 }
}