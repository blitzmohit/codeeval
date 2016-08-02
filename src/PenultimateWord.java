import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by geek90 on 8/2/16.
 */
public class PenultimateWord {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        String val1="", val2 ="";
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            Scanner in = new Scanner(line);

            while ( in.hasNext() ){
                val1 = val2;

                val2 = in.next();
            }
            System.out.println(val1);
        }
    }
}
