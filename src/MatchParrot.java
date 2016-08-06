import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatchParrot{

    public static void main(String args[]) throws IOException {

        File file = new File(args[0]);

        String marker = args[1] , output, temp[], line, pattern;

        BufferedReader bufferedReader =  new BufferedReader(new FileReader(file));

        pattern = ".*"+marker+"_\\d_\\d_\\d\\s*RUNNING";

        Pattern newPattern = Pattern.compile(pattern);

        while((line = bufferedReader.readLine()) !=null ){

            Matcher matcher = newPattern.matcher(line);

            if( matcher.find()){
                temp = line.split("       ");
                output =  temp[0];
                System.out.println(output);
            }


        }
    }

}