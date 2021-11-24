package 배열_1차원배열;

import java.io.*;
import java.util.StringTokenizer;

/*
평균
https://www.acmicpc.net/problem/1546
 */
public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        double[] nArr = new double[N];
        double max = 0.0;
        double resutl = 0;
        for(int i = 0; i<N; i++){
            nArr[i] = Integer.parseInt(st.nextToken());
            if(max<nArr[i]){
                max = nArr[i];
            }
        }
        for(int i = 0; i<N; i++){
            nArr[i] = nArr[i]/max*100;
            resutl += nArr[i];
        }
        bw.write(resutl/N+"");
        bw.flush();
    }
}
