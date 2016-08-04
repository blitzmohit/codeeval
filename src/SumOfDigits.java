import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 8/3/16.
 */
public class SumOfDigits {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int sum;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            sum  = 0;
            // Process line of input Here
            for (char x : line.toCharArray()){
                sum  += Character.digit(x,10);
            }
            System.out.println(sum);
        }
    }
}
