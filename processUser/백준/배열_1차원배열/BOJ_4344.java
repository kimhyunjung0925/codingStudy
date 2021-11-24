package 배열_1차원배열;

import java.io.*;
import java.util.StringTokenizer;
/*
평균은 넘겠지
https://www.acmicpc.net/problem/4344
 */
public class BOJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());
        double[] a = new double[C];
        for(int i = 0; i<C; i++){
            int N;
            int sum = 0;
            int avg;
            int count =0;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int[] num = new int[N];
            for (int j = 0; j<N; j++) {
                num[j] = Integer.parseInt(st.nextToken());
                sum += num[j];
            }
            avg = sum / N;
            for (int j = 0; j<N; j++) {
                if(avg < num[j]){
                    count++;
                }
            }
            a[i] = ((double) count/N)*100;
        }
        for (double d : a){
            bw.write(String.format("%.3f",d)+"%\n");
        }
        bw.flush();
    }
}
