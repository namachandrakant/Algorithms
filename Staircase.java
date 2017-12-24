import java.io.*;
import java.util.*;

public class Staircase {

    private static final char SPACE=' ';
    private static final char HASH='#';
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int numHash=1;
        char c=SPACE;
        for(int i=0;i<N;i++){
	       for(int j=0;j<N;j++){
               if(j>=(N-numHash))
                   c=HASH;
               else
                   c=SPACE;
               System.out.print(c);
           }
           numHash++;
           System.out.println();
        }
        
    }
}
