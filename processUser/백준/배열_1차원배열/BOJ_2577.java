package 배열_1차원배열;
import java.io.*;
import java.util.StringTokenizer;
/*
숫자의 개수
https://www.acmicpc.net/problem/2577
 */
public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;


        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = A * B * C;
        String[] str = String.valueOf(D).split("");
        int[] nArr;
        nArr = new int[10];
        for (int i = 0; i < str.length; i++) {
            nArr[(Integer.parseInt(str[i])) % 10]++;
        }
        for (int i = 0; i < nArr.length; i++) {
            bw.write(nArr[i]+"\n");
        }
        bw.flush();
    }
}
