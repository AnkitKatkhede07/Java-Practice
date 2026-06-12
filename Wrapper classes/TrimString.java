public class TrimString {
    public static void main(String[] args) {

        String str = "   Hello Java   ";
        int start = 0;
        int end = str.length() - 1;

        // Remove leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Remove trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Build trimmed string
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }

        System.out.println(result);
    }
}
