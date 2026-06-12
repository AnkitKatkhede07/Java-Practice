//Wap in java to input the array and check array is pallindrom or not.
import java.util.*;
public class Palindrome
{
  public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
System.out.println("Enter Array size:");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter arrya in Element");
for(int i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}

//check
for(int i=0;i<arr.length;i++){
 boolean result = isPalindrome(arr[i]);
if(result)
{
   System.out.println("Number is Palindrome"+arr[i]);
}
else{
 System.out.println("Number is not Palindrome"+arr[i]);
  }
 }
}//method fumcation
public static boolean isPalindrome(int no){
int original=no;
int rev=0;

while(no!=0)
{
  int digit=no%10;
  rev=rev*10+digit;
  no=no/10;
}
return rev == original;

}
}
