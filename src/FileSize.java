import java.io.*;

/**
 * Created by geek90 on 8/4/16.
 */
public class FileSize {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);

        System.out.println(file.length());
    }
}
