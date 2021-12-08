package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] idx = new int[4];
        idx[0] = x;
        idx[1] = y;
        idx[2] = h-y;
        idx[3] = w-x;

        int min = idx[0];
        for(int i=0; i< idx.length; i++){
            if(min > idx[i]){
                min = idx[i];
            }
        }
        System.out.println(min);
    }
}
