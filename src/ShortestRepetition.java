import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 8/3/16.
 */
public class ShortestRepetition {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line , copyLine="", rep;
        int repetitionLength,count;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            repetitionLength = 1;

            if( line.length() == 1 ){
                System.out.println(line.length());
            }else{
                while (repetitionLength <= (line.length() / 2)) {
                    rep = line.substring(0, repetitionLength);
                    copyLine = line;
                    while( copyLine.startsWith(rep)){
                        copyLine = copyLine.substring(rep.length());
                    }
                    if( copyLine.isEmpty() ){
//                    System.out.println(rep);
                        System.out.println(rep.length());
                        break;
                    }
                    repetitionLength++;
                }
                if( !copyLine.isEmpty() ){
//                System.out.println(line);
                    System.out.println(line.length());
                }
            }

        }
    }


}
