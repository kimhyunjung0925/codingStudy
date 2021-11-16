package for문;
import java.io.*;
import java.util.StringTokenizer;
/*
A+B - 7
https://www.acmicpc.net/problem/11021
 */
public class BOJ_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        int n = Integer.parseInt(str);

        for(int i = 1; i <= n; i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;
            bw.write("Case #"+i+": "+sum+"\n");
        }

        bw.flush();
    }
}
