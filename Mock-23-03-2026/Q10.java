/*Q10.Write program to group words by their length using HashMap. 
Input: 
cat dog elephant tiger lion 
Output: 
3 → cat dog 
4 → lion 
5 → tiger 
8 → elephant*/

import java.util.*;

public class Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words:");
        String s = sc.nextLine();

        String words[] = s.split(" ");

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            int len = words[i].length();

            if(map.containsKey(len)) {
                map.put(len, map.get(len) + " " + words[i]);
            } else {
                map.put(len, words[i]);
            }
        }

        // print output
        for(int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}