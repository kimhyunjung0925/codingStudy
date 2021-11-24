//https://www.acmicpc.net/problem/1065
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n < 100) {
            System.out.println(n);
        } else {
            int count =99;
            for(int i=100;i<=n; i++ ){
                String str = String.valueOf(i);
                char[] chs = str.toCharArray();
                if(arithmetic_num(chs)==1){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
    public static int arithmetic_num ( char[] chs){
        int[] arr = new int[chs.length];
        int num;
        for (int i = 0; i < chs.length; i++) {
            arr[i] = Character.getNumericValue(chs[i]);
        }
        num = arr[0] - arr[1];
        for (int j = 2; j < arr.length; j++) {
            if (arr[j-1] - arr[j] != num) {
                return 0;
            }
        }
        return 1;
    }
}


