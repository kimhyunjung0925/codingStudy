package 문자열;

import java.io.*;
/*
알파벳 찾기
https://www.acmicpc.net/problem/10809
 */
public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[26];
        for (int i =0; i<a.length; i++){
            a[i] = -1;
        }
        String str = br.readLine();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (a[ch-'a'] == -1)
                a[ch-'a'] = i;
        }
        for(int i : a){
            bw.write(i+" ");
        }
        bw.flush();
    }
}
