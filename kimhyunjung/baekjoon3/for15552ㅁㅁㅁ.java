package baekjoon3;

import java.io.*;
import java.util.Scanner;

//뭔소린지 모르겠음
public class for15552ㅁㅁㅁ {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        for(int i = 0; i < N; i++){
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}

