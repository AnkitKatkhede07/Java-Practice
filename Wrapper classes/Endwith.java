public class Endwith {
    public static void main(String[] args) {

        String str = "I am Lucky boy";
        String end = "boy";

        boolean isEnd = true;

        int strLen = str.length();
        int endLen = end.length();

        // If ending string is longer than main string
        if (endLen > strLen) {
            isEnd = false;
        } else {
            int j = endLen - 1;

            for (int i = strLen - 1; j >= 0; i--) {
                if (str.charAt(i) != end.charAt(j)) {
                    isEnd = false;
                    break;
                }
                j--;
            }
        }

        if (isEnd) {
            System.out.println("String ends with \"" + end + "\"");
        } else {
            System.out.println("String does NOT end with \"" + end + "\"");
        }
    }
}
