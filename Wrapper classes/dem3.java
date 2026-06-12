import java.util.ArrayList;
public class dem3 {

    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int pos = binarySearch(list, num);

            if (pos == list.size()) {
                list.add(num);          // extend LIS
            } else {
                list.set(pos, num);     // replace element
            }
        }
        return list.size();
    }

    // Custom Binary Search
    private static int binarySearch(ArrayList<Integer> list, int target) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (list.get(mid) >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(arr)); // Output: 4
    }
}


