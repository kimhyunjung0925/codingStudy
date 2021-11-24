//https://www.acmicpc.net/problem/11720
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count  = scan.nextInt();
        String num = scan.next();
        char[] chs = num.toCharArray();
        int sum=0;
        for(int i=0; i<count; i++){
            sum+=Character.getNumericValue(chs[i]);
        }

        System.out.println(sum);
     }
}


