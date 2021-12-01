package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine()); //테스트 케이스

        for(int i=0; i<cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            st.nextToken(); //w는 그냥 버려도 됨
            int n = Integer.parseInt(st.nextToken());

            if (n % h == 0) {
                System.out.println((h*100)+(n/h));
            } else {
                System.out.println((n%h*100)+(n/h+1));
            }
        }
    }
}
