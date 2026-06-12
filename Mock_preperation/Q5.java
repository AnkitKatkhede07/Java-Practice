/* Q5. Write a java program to store words in an ArrayList. Print words that start and end with the 
same character. 
Input: [level, cat, radar, java, madam] 
Output : level , radar , madam 
Description: 
Traverse each word and compare first and last character manually using charAt(). */
import java.util.*;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter words: ");
        int n = sc.nextInt();//number of word size

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(sc.next());//4 word enter in

        System.out.println("Words : ");

        for (String s : list) {//for each loop to travles array

            if (s.charAt(0) == s.charAt(s.length() - 1))
                System.out.print(s + " ");
        }
    }
}