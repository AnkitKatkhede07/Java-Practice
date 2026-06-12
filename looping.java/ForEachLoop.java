public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum1 = 0;
        int sum2 = 0;

        // 🔹 Normal for loop
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];   // Access element using index i
        }
        System.out.println("Sum using normal for loop: " + sum1);

        // 🔹 Enhanced for loop
        for (int no : arr) {
            sum2 = sum2 + no;      // Access each element directly
        }
        System.out.println("Sum using enhanced for loop: " + sum2);
    }
}
