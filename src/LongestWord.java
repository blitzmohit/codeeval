import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by geek90 on 8/4/16.
 *
 */
public class LongestWord {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line, word, longestWord;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            Scanner in = new Scanner(line);
            longestWord = "";
            while ( in.hasNext() ){
                word = in.next();
                if( longestWord.length() < word.length() ){
                    longestWord = word;
                }
            }

            System.out.println(longestWord);
        }
    }

}
