import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 7/28/16.
 */
public class Details {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int minCount = Integer.MAX_VALUE;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            int count = 0;
            String[] parts = line.split(",");
            for( String part : parts ){
                for( char x : part.toCharArray() ){
                    if( x == '.'){
                        count++;
                    }
                }
                if( count < minCount ){
                    minCount =  count;
                }
                count = 0;
            }
            System.out.println(minCount);
            minCount = Integer.MAX_VALUE;
        }
    }
}
