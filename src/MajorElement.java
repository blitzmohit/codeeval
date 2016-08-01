import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by geek90 on 7/28/16.
 */
public class MajorElement {
    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            HashMap<Integer,Integer> majorElements = new HashMap<>();

            int count = 0,temp;

            Scanner in = new Scanner(line).useDelimiter(",");

            while( in.hasNext() ){
                int element = in.nextInt();
                count++;
                if( majorElements.containsKey(element) ){
                    temp = majorElements.get(element);

                    majorElements.put(element, ++temp);
                }else{
                    majorElements.put(element, 1);
                }
            }

            boolean flag = false;

            for( Integer key :majorElements.keySet() ){
                if( majorElements.get(key) > (count/2) ){
                    System.out.println(key);
                    flag = true ;
                    break;
                }
            }
            if( !flag ){
                System.out.println("None");
            }
        }
    }
}
