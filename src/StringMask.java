import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 8/3/16.
 */
public class StringMask {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] chars = line.split(" ");

            char[] letters = chars[0].toCharArray();

            char[] numbers = chars[1].toCharArray();

            for (int i = 0; i < letters.length ; i++) {
                if( numbers[i] == '1'){
                    letters[i] = Character.toUpperCase(letters[i]);
                }

                stringBuilder.append(letters[i]);
            }
            System.out.println(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
    }
}

