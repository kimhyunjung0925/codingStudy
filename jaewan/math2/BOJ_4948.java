package boj;

import java.io.*;

public class BOJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num;
        while((num = Integer.parseInt(br.readLine())) != 0) {
            int count = 0;

            for(int i = num + 1 ; i <= num * 2 ; i++) {
                if(check(i)) {
                    count++;
                }else {
                    continue;
                }
            }

            bw.write(String.valueOf(count) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static boolean check(int num) {
        if(num == 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        for(int i = 2 ; i <= (int)Math.sqrt(num) ; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
