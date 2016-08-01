import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by geek90 on 7/29/16.
 */
public class ReverseWords {
    public static void main(String[] args) throws IOException {
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();

                Scanner in = new Scanner(line);

                ArrayDeque<String> reversed = new ArrayDeque<>();

                while (in.hasNext()){
                    reversed.addFirst(in.next());
                }

                System.out.println(reversed.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" ")));
            }
    }
}
