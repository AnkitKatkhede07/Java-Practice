/* 3. Write a program to count vowels, consonants, digits, and special characters.
 Check each character using conditions. */
 import java.util.Scanner;
public class check
{
 public static void main(String args[])
 { Scanner sc = new Scanner(System.in);
 System.out.println("Enter a String");
  String s=sc.next();
  int vowels=0,consonants=0,digits=0,special=0;
  s=s.toLowerCase();
    for(char ch:s.toCharArray())
	{
		 if(ch>='a'&&ch<='z')
		 {
			 if("aeiou".indexOf(ch)!=-1)
			 {
				 vowels++;
			 
			 }else{
				consonants++;
			 
		 }
		 }
		 else if(ch>='0'&& ch<='9')
				 digits++;
			 else
				 special++;
		 
	}
	System.out.println(vowels+" vowels "+consonants+" consonants  "+digits+" digits  "+special+" special character ");
  
 }
}