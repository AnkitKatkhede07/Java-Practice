/* Q3.Write a java program to find common elements between two arrays using Map. 
 Input :- Array1: {1, 2, 3, 4, 5} 
  Array2: {3, 4, 5, 6, 7} 
Output :- Common Elements: 3 4 5 
Description: 
Store first array elements in Map. Traverse second array and check manually if element exists. */
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        HashMap<Integer,Integer> map = new HashMap<>();

        // Store first array
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],1);
        }

        System.out.print("Common Elements: ");

        // Check second array
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                System.out.print(arr2[i]+" ");
            }
        }
    }
}