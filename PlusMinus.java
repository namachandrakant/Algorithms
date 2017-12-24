import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int pn=0,nn=0,zn=0;
        float fN=N;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0) pn++;
            else if(arr[i]<0) nn++;
            else zn++;
        }
        System.out.printf("%.6f\n",pn/fN);
        System.out.printf("%.6f\n",nn/fN);
        System.out.printf("%.6f\n",zn/fN);
    }
}
