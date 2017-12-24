import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        if(s==null) return null;
        if(s.contains("AM")){ 
            int hour = Integer.parseInt(s.substring(0,s.indexOf(":")));
            if(hour==12) return "00"+s.substring(s.indexOf(":"),s.indexOf("AM"));            
            return s.substring(0,s.indexOf("AM"));
        }else{
            int hour = Integer.parseInt(s.substring(0,s.indexOf(":")));
            if(hour==12) return s.substring(0,s.indexOf("PM"));  
            hour+=12;
            return hour+s.substring(s.indexOf(":"),s.indexOf("PM"));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();        
        String result = timeConversion(s);
        System.out.println(result);
    }
}
