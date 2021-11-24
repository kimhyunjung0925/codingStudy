package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String str1 = new StringBuilder(st.nextToken()).reverse().toString();
        String str2 = new StringBuilder(st.nextToken()).reverse().toString();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        System.out.println(a > b ? a : b);
    }
}
