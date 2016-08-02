import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by geek90 on 8/1/16.
 */
public class QueryBoard {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line, command;
        int[][] board =  new int[256][256];
        int value, location,sum;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            sum = 0;

            Scanner in = new Scanner(line);

            command = in.next();

            switch ( command ){
                case "SetCol":
                    location = in.nextInt();

                    value = in.nextInt();

                    for (int i = 0; i < 256; i++) {
                        board[i][location] = value;
                    }
                    break;
                case "SetRow":
                    location = in.nextInt();

                    value = in.nextInt();

                    for (int i = 0; i < 256; i++) {
                        board[location][i] = value;
                    }
                    break;
                case "QueryCol":
                    location = in.nextInt();

                    for (int i = 0; i < 256; i++) {
                        sum+=board[i][location];
                    }

                    System.out.println(sum);

                    break;
                case "QueryRow":
                    location = in.nextInt();

                    for (int i = 0; i < 256; i++) {
                        sum+=board[location][i];
                    }

                    System.out.println(sum);

                    break;
            }
        }
    }
}
