package 문자열;

import java.io.*;
/*
단어 공부
https://www.acmicpc.net/problem/1157
 */
public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[26];
        String str = br.readLine();
        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A'&& ch <= 'Z')
                ch+=32;
            a[ch-'a'] += 1;
        }
        int max =0, idx = 0;
        for (int i =0; i<a.length; i++){
            if(max == a[i]){
                idx = -2;
            } else {
                if (max < a[i]) {
                    max = a[i];
                    idx = i;
                }
            }
        }
        bw.write(idx+'A');
        bw.flush();
    }
}
