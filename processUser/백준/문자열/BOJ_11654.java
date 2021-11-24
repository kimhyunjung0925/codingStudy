package 문자열;

import java.io.*;
/*
아스키 코드
https://www.acmicpc.net/problem/11654
 */

public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = br.read();
        bw.write(count+"");
        bw.flush();
    }
}
