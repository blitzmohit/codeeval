import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by geek90 on 8/1/16.
 */
public class DataRecovery {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        HashMap<Integer,String> map =  new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder();

        int sum, last,i;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            sum = 0;

            String[] parts = line.split(";");

            String[] strings = parts[0].split(" ");

            String[] numbers = parts[1].split(" ");

            for (String number : numbers) {
                sum += Integer.valueOf(number);
            }

            int count = strings.length;

            last = (((count+1) * count) / 2) - sum ;

            for ( i = 0; i < count -1 ; i++ ){
                map.put(Integer.valueOf(numbers[i]),strings[i]);
            }


            map.put(last, strings[i]);

            for ( i=1; i <= count; i++ ){
                stringBuilder.append(map.get(i)).append(" ");
            }

            System.out.println(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
    }
}
