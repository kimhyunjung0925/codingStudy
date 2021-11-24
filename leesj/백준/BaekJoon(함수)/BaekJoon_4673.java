//https://www.acmicpc.net/problem/4673
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=10000; i++){
            list.add(i);
        }
        for(int i=1; i<=10000; i++){
           int delnum = selnumber(i);

           for(int j=0; j<list.size(); j++){
               if(delnum==list.get(j)){
                   list.remove(j);
                   break;
               }
           }

        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static int selnumber(int n){
        String str = String.valueOf(n);
        char[] chs = str.toCharArray();
        int[] arr = new int[chs.length];
        int sum=0;
        for(int i=0; i<chs.length; i++){
            arr[i]=Character.getNumericValue(chs[i]);
            sum+=arr[i];

        }
        return sum+n;
    }
}


