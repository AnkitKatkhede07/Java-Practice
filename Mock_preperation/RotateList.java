/* Q4. Store N integers in an ArrayList. Rotate the list left by K positions without using 
Collections.rotate(). 
 
 
 
Giri’s Tech Hub, Pune. 
Core Java Machine Test 
Batch: June-24 to June-25 Date : 20/02/2025 
Time : 08 to 12 Pm. 
Input: 
5 
1 2 3 4 5 
K = 2 
Output: 
Rotated List: 3 4 5 1 2 
Description: 
Manually shift elements using loops.  */
import java.util.*;

public class RotateList {
    public static void main(String[] args) {

        ArrayList<Integer> list =
            new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int k = 2;

        for(int i=0;i<k;i++){
            int first = list.get(0);
            list.remove(0);
            list.add(first);
        }

        System.out.println("Rotated List: " + list);
    }
}