import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s!=null){
            int i=1;
            for(char c: s.toCharArray()){
                if(Character.isUpperCase(c)) i++;
            }
            System.out.println(i);
        }
    }
}
