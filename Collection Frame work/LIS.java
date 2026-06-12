/*9. Longest Increasing Subsequence
Description:
Return length of LIS using ArrayList and binary search.
Example:
Input: [10,9,2,5,3,7,101,18]
Output: 4
*/
import java.util.*;
public class LIS
{
  public static void main(String args[])
  {
     ArrayList<Integer>al=new ArrayList<>();
	 int arr[]={10,9,2,5,3,7,101,18};
	
	 
	 for(int num:arr)
	 {
	 {
		int pos=num,al;	
	 }
	 if(pos == al.size())
	 {
		 al.add(num);
	 }
	 else
	 {
		 al.set(pos,num);
	 }
	 }return al.size();
  }
} 
//==============================================================================
