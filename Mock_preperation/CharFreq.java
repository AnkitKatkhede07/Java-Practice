/* Q5. Write a Java program that takes a string and stores each character with its frequency using 
a Map. 
Input 
String: "programming" 
Output : p → 1     r → 2 o → 1    g → 2   a → 1   m → 2   i → 1   n → 1 
 
Description: 
Do not use any inbuilt string methods for counting. Traverse character by character and update 
the map manually. */
import java.util.*;

public class CharFreq {
    public static void main(String[] args) {

        String s = "programming";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch,1);
        }

        System.out.println(map);
    }
}