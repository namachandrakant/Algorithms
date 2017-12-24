import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        int skip=0;
        long min=Long.MAX_VALUE,max=Long.MIN_VALUE,sum=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
            if(arr[arr_i]>max)max=arr[arr_i];
            if(arr[arr_i]<min)min=arr[arr_i];
            sum+=arr[arr_i];
        }
   
        System.out.println((sum-max)+" "+(sum-min));
    }
}
