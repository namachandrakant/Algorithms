import java.io.*;
import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int number=0;
        Map<Integer,Integer> map1=new HashMap<>();
        for (int i=0;i<n1;i++){
            number=sc.nextInt();
            if(map1.get(number)==null) map1.put(number,1);
            else {
                map1.put(number,map1.get(number)+1);
            }
        }
          n1=sc.nextInt();
          Map<Integer,Integer> map2=new HashMap<>();
        for (int i=0;i<n1;i++){
            number=sc.nextInt();
            if(map2.get(number)==null) map2.put(number,1);
            else {
                map2.put(number,map2.get(number)+1);
            }
        }
        List<Integer> result=new ArrayList<>();
        int d=0,c1,c2;
        for(Integer num : map1.keySet()){
            c1=map1.get(num);
            c2=map2.get(num);
            if(c1>c2)d=c1-c2;
            else if (c1<c2) d=c2-c1;
            if(d>0) {
                result.add(num);
                d=0;
            }
        }
        Collections.sort(result);
        result.forEach(p -> System.out.print(p+" "));
    }
}
