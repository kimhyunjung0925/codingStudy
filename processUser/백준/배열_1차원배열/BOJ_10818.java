package 배열_1차원배열;

import java.io.*;
import java.util.*;
/*
최소, 최대
https://www.acmicpc.net/problem/10818
 */

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        TreeSet ts = new TreeSet();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            ts.add(Integer.parseInt(st.nextToken()));
        }
        System.out.printf("%d %d", ts.first(),ts.last());
    }
}
