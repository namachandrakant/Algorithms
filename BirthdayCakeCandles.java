import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, long[] ar) {
        int numCandle=1;
        long max=Long.MIN_VALUE;        
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]){ max=ar[i];
                        numCandle=1;} 
            else if(max==ar[i])numCandle++;
            
        }
        return max > 0 ? numCandle:0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
