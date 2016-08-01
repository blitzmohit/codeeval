import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by geek90 on 7/28/16.
 */
public class TimeToEat {
    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            ArrayList<String> times = new ArrayList<>();

            Scanner in = new Scanner(line);

            while ( in.hasNext() ){
                String newTime = in.next();
                boolean added = false;
                for(ListIterator<String> iterator = times.listIterator(); iterator.hasNext();){
                    String time = iterator.next();
                    if( !isFirstTimeBigger(time, newTime) ){
                        iterator.previous();
                        iterator.add(newTime);
                        added = true;
                        break;
                    }
                }
                if( !added ){
                   times.add(newTime);
                }
            }
            System.out.println(times.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
        }
    }

    private static boolean isFirstTimeBigger(String time, String newTime) {
        String[] timeStrings = time.split(":");
        String[] newTimes =  newTime.split(":");
        for( int i=0; i< timeStrings.length;i++ ){
            int firstTime = Integer.valueOf(timeStrings[i]);
            int secondTime = Integer.valueOf(newTimes[i]);

            if( firstTime > secondTime){
                return true;
            }else{
                if( firstTime!= secondTime){
                    return false;
                }
            }
        }
        return false;
    }
}
