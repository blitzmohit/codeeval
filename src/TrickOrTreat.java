import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by geek90 on 8/2/16.
 */
public class TrickOrTreat {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        int vampiresCandies = 3, zombiesCandies = 4 , witchesCandies = 5;

        int vampireCount=0, zombieCount=0, witchCount=0, houseCount=0, candies=0;

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            Scanner in = new Scanner(line);

            while( in.hasNext() ){
                switch (in.next()){
                    case "Vampires:":
                        vampireCount = Integer.valueOf(in.next().split(",")[0]);
                        break;
                    case "Zombies:":
                        zombieCount = Integer.valueOf(in.next().split(",")[0]);
                        break;
                    case "Witches:":
                        witchCount = Integer.valueOf(in.next().split(",")[0]);
                        break;
                    case "Houses:":
                        houseCount = Integer.valueOf(in.next().split(",")[0]);
                        break;
                }
            }
            candies = (vampiresCandies * vampireCount + zombiesCandies * zombieCount + witchesCandies * witchCount) * houseCount;

            System.out.println(candies / (vampireCount+zombieCount+witchCount));
        }
    }

}
