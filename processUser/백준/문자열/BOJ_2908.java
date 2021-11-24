package 문자열;

import java.io.*;
/*
상수
https://www.acmicpc.net/problem/2908
 */
public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer(br.readLine());
        String[] str = sb.reverse().toString().split(" ");
        int[] a = new int[str.length];
        for(int i = 0; i<a.length; i++){
            a[i] = Integer.parseInt(str[i]);
        }
        if(a[0]<a[1]){
            bw.write(a[1]+"");
        } else {
            bw.write(a[0]+"");
        }
        bw.flush();
    }
}
