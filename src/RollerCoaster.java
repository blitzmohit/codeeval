import java.io.*;

/**
 * Created by geek90 on 8/3/16.
 */
public class RollerCoaster {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int count;
        StringBuilder sb = new StringBuilder();
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            count = 0;
            for( char x  :  line.toCharArray() ){
                if(Character.isLetter(x)){
                    if( count % 2 == 0 ){
                        x = Character.toUpperCase(x);
                    }else{
                       x = Character.toLowerCase(x);
                    }
                    count++;
                }
                sb.append(x);
            }
            System.out.println(sb.toString());

            sb.setLength(0);
        }
    }
}
