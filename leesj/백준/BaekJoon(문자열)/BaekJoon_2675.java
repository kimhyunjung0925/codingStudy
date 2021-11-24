//https://www.acmicpc.net/problem/2675
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test_num = scan.nextInt();
        char[] chs2;
        String[] sss = new String[test_num];

        for(int i=0; i<test_num; i++){
            int count = scan.nextInt();
            String str = scan.next();

            char[] chs = str.toCharArray();
            chs2 = new char[count*str.length()];


            for(int j=0; j<str.length(); j++){
                for(int k=count*j; k<count*(j+1); k++){
                    chs2[k]=chs[j];
                }
            }
            sss[i] = String.valueOf(chs2);
        }

        for(int i=0; i<test_num; i++){
            System.out.println(sss[i]);
        }

    }
}


