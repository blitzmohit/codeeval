import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 7/29/16.
 */
public class HiddenDigits {
    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            StringBuilder stringBuilder = new StringBuilder();
            for (char x : line.toCharArray()) {
                if (Character.isDigit(x)) {
                    stringBuilder.append(x);
                } else {
                    switch (x) {
                        case 'a':
                            stringBuilder.append("0");
                            break;
                        case 'b':
                            stringBuilder.append("1");
                            break;
                        case 'c':
                            stringBuilder.append("2");
                            break;
                        case 'd':
                            stringBuilder.append("3");
                            break;
                        case 'e':
                            stringBuilder.append("4");
                            break;
                        case 'f':
                            stringBuilder.append("5");
                            break;
                        case 'g':
                            stringBuilder.append("6");
                            break;
                        case 'h':
                            stringBuilder.append("7");
                            break;
                        case 'i':
                            stringBuilder.append("8");
                            break;
                        case 'j':
                            stringBuilder.append("9");
                            break;
                    }
                }
            }
            if (stringBuilder.length() == 0) {
                System.out.println("NONE");
            } else {
                System.out.println(stringBuilder.toString());
            }
        }
    }
}
