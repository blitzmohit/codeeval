import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by geek90 on 8/4/16.
 */
public class BeautifulStrings {
    public static void main(String[] args) throws IOException {
        File file = new File( args [0] );
        BufferedReader bufferedReader =  new BufferedReader(new FileReader(file));
        String line;
        int sum, currentMax, temp;
        HashMap<Character,Integer> beautyValues = new HashMap<>();

        ArrayList<Integer> arrayList =  new ArrayList<>();

        while ( (line = bufferedReader.readLine()) != null ){
            sum = 0;
            currentMax = 26 ;
            for (char x : line.toCharArray()){
                if( Character.isLetter(x)){
                    x = Character.toLowerCase(x);

                    if( beautyValues.containsKey(x)){
                        temp = beautyValues.get(x);
                        temp++;
                        beautyValues.put( x,temp );
                    }else{
                        beautyValues.put(x,1);
                    }
                }

            }

            arrayList.addAll(beautyValues.values());

            Collections.sort(arrayList,Collections.reverseOrder());

            for ( int val : arrayList ){
                sum += val * currentMax--;
            }

            System.out.println(sum);
            arrayList.clear();
            beautyValues.clear();
        }
    }
}
