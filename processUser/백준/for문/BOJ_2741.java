package for문;
import java.io.*;
import java.util.StringTokenizer;
/*
N 찍기
https://www.acmicpc.net/problem/2741
 */
public class BOJ_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++){
            bw.write(i+"\n");
        }
        bw.flush();
    }
}
