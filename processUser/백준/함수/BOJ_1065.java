package 함수;

import java.io.*;
/*
한수
https://www.acmicpc.net/problem/1065
 */
public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = BOJ_1065.count(Integer.parseInt(br.readLine())); //110
        bw.write(count+"");
        bw.flush();
    }
    public static int count(int num) {
        int count = 0;
        if(1<= num && num<100){
            // 100 미만 은 1한수 - 총 99개
            count = num;
        } else {
            count = 99;

            for(int i = 100; i <= num;i++) {
                int A = (i / 10) / 10; //백의 자리
                int B = (i / 10) % 10; //십의 자리
                int C = i % 10; //일의 자리
                if (A - B == B - C) {
                    count++;
                }
            }
        }
        return count;
    }
}
