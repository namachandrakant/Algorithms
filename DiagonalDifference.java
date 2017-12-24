import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int arr[][]=new int[N][N];
        int d1=0,d2=0;
        for(int i=0;i<N;i++){
	       for(int j=0;j<N;j++){
		      arr[i][j]=sc.nextInt();
              if(i==j){
			     d1+=arr[i][j];
              }
		      if(j==N-1-i){
			     d2+=arr[i][j];
              }
	       }
	   }
       System.out.println(Math.abs(d1-d2));
    }
}
