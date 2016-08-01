import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by geek90 on 7/28/16.
 */
public class HighestScore {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);

        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {
            ArrayList<Integer> highest = new ArrayList<>();

            line = line.trim();

            Scanner s = new Scanner(line);

            int id = 0;

            int set = 0;

            while (s.hasNext()) {
                String x = s.next();

                if (x.equals("|")) {

                    set++;
                    id = 0;
                } else {
                    if (set == 0) {
                        highest.add(Integer.valueOf(x));
                    } else {
                        if (highest.get(id) < Integer.valueOf(x)) {
                            highest.set(id, Integer.valueOf(x));
                        }
                        id++;
                    }

                }
            }

            System.out.println(highest.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));

        }
    }
}
