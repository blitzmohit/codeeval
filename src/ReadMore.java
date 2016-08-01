import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 7/28/16.
 */
public class ReadMore {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            if( line.length() <= 55 ){
                System.out.println(line);
            }else{
                line = line.substring(0,40);

                int index = line.lastIndexOf(" ");

                if( index != -1 ){
                    line = line.substring(0,index);
                }

                System.out.println(line+"... <Read More>");
            }
        }
    }
}
