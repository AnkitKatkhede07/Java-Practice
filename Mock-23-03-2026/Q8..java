/* 
Q8. Check whether expression has balanced parentheses. 
Input: 
{[()]} 
Output: 
Balanced*/

import java.util.*;

public class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter expression:");
        String s = sc.nextLine();

        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                count++;
            }
            else if(ch == ')') {
                count--;
            }

            if(count < 0) {
                break;
            }
        }

        if(count == 0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}