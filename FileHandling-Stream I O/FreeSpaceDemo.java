import java.io.File;

public class FreeSpaceDemo {
    public static void main(String[] args) {

        // C drive (Windows) — you can change to D:/ , E:/ etc.
        File drive = new File("C:/");

        long freeBytes = drive.getFreeSpace();   // bytes
        long freeBits = freeBytes * 8;            // bits

        System.out.println("Free Space in Bytes: " + freeBytes);
        System.out.println("Free Space in Bits : " + freeBits);
    }
}
