package while문;
import java.io.*;
/*
더하기 사이클
https://www.acmicpc.net/problem/1110
 */

public class BOJ_1110 {
    // 참고 - https://st-lab.tistory.com/42
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = n;
        int cnt = 0;
        do {
            n = ((n%10)*10)+(((n/10)+(n%10))%10);
            cnt++;

        }while (num != n);
        System.out.println(cnt);
    }
}
