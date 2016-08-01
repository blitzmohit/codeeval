import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geek90 on 7/28/16.
 */
public class SumOfPrimes {
    public static void main(String[] args) throws IOException{
        System.out.println(sumOfPrimes(1000));
    }

    private static int sumOfPrimes(int number) {
        int sum = 0, i = 2;

       for ( int j = 0; j < number;) {
            if ( isPrime(i) ){
                System.out.println(i);
                sum+=i;
                j++;
            }
            i++;
        }

        return sum;
    }

    private static boolean isPrime( int x ){
        for (int i = 2; i < Math.sqrt(x)+1; i++) {
            if( x % i == 0 && x != i  ){
                return false;
            }
        }
        return true;
    }
}
