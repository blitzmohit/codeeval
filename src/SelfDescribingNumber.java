import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by geek90 on 7/29/16.
 */
public class SelfDescribingNumber {
    private static boolean flag = true;

    public static void main(String[] args) throws IOException{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int tempValue;
        HashMap<Character,Integer> countingMap = new HashMap<>();
        while ((line = buffer.readLine()) != null) {
            flag = true;
            line = line.trim();
            // Process line of input Here
            for (char x : line.toCharArray()){
                if (!countingMap.containsKey(x)){
                    countingMap.put(x,1);
                }else{
                    tempValue = countingMap.get(x);
                    countingMap.put(x,++tempValue);
                }
            }

            for ( int i=0; i < line.length(); i++ ){
                Character x = Character.forDigit(i,10);
                if( Character.getNumericValue(line.charAt(i)) != countingMap.getOrDefault(x,0) ){
                    flag = false;
                    break;
                }
            }

            if ( !flag){
                System.out.println("0");
            }else {
                System.out.println("1");
            }
            countingMap.clear();
        }
    }
}
