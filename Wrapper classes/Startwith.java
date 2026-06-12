public class Startwith {
    public static void main(String[] args) {

        String str = "I am Lucky boy";
        String start = "I am ";

        boolean isStart = true;

        int strLen = str.length();
        int startLen = start.length();

        // If start string is longer than main string
        if (startLen > strLen) {
            isStart = false;
        } else {
            for (int i = 0; i < startLen; i++) {
                if (str.charAt(i) != start.charAt(i)) {
                    isStart = false;
                    break;
                }
            }
        }

        if (isStart) {
            System.out.println("String starts with \"" + start + "\"");
        } else {
            System.out.println("String does NOT start with \"" + start + "\"");
        }
    }
}
