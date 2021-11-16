package for문;
import java.io.*;
import java.util.StringTokenizer;
/*
별 찍기 - 1
https://www.acmicpc.net/problem/2438
 */
public class BOJ_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        int n = Integer.parseInt(str);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
    }
}
