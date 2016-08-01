import java.io.*;

/**
 * Created by geek90 on 7/31/16.
 */
public class Hex2Decimal {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int count;
        int hex=0;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            hex = 0;
            count = line.length() - 1;
            // Process line of input Here
            for (char x: line.toCharArray()){
                switch (x){
                    case 'a':
                    case 'A':
                        hex+= 10 * Math.pow(16,count);
                        break;
                    case 'b':
                    case 'B':
                        hex+= 11 * Math.pow(16,count);
                        break;
                    case 'c':
                    case 'C':
                        hex+= 12 * Math.pow(16,count);
                        break;

                    case 'd':
                    case 'D':
                        hex+= 13 * Math.pow(16,count);
                        break;

                    case 'e':
                    case 'E':
                        hex+= 14 * Math.pow(16,count);
                        break;

                    case 'f':
                    case 'F':
                        hex+= 15 * Math.pow(16,count);
                        break;

                    default:
                        hex+=Character.digit(x,10) * Math.pow(16,count);
                }
                count--;
            }
            System.out.println(hex);
        }

    }
}
