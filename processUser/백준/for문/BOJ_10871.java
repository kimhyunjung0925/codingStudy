package for문;
import java.io.*;
import java.util.StringTokenizer;
/*
X보다 작은 수
https://www.acmicpc.net/problem/10871
 */
public class BOJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        str = br.readLine();
        st = new StringTokenizer(str);

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            if(A[i] < X){
                bw.write(A[i]+" ");
            }
        }

        bw.flush();
    }
}
