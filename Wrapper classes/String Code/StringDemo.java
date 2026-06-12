public class StringDemo {
    public static void main(String[] args) {
        String s = "  Hello Java  ";
        System.out.println("Original: " + s);
        System.out.println("Trimmed: " + s.trim());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Substring(2,8): " + s.substring(2,8));
        System.out.println("Replace: " + s.replace("Java", "World"));
        System.out.println("Contains 'Hello'? " + s.contains("Hello"));
        System.out.println("Character at 4: " + s.charAt(4));
        System.out.println("Length: " + s.length());
    }
}
