public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int n = removeDuplicates(arr);
        System.out.print("Unique elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
