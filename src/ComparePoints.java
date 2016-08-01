import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by geek90 on 7/31/16.
 */
public class ComparePoints {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            Scanner in = new Scanner(line);

            int x1 = in.nextInt();

            int y1 = in.nextInt();

            int x2 = in.nextInt();

            int y2 = in.nextInt();

            int xResult = (x2-x1);

            int yResult = (y2 - y1);


            if( xResult == 0 && yResult == 0 ) {
                System.out.print("here");
            } else {
                if( yResult != 0 ){
                    if ( yResult > 0 ){
                        System.out.print("N");
                    }else{
                        System.out.print("S");
                    }
                }
                if ( xResult != 0 ){
                    if (xResult > 0 ){
                        System.out.print("E");
                    }else{
                        System.out.print("W");
                    }
                }
            }
            System.out.println();
        }

    }
}
