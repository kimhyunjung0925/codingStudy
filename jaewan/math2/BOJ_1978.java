package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            boolean bl = true;
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){continue;}

            for(int i=2; i<num; i++){
                if(num % i == 0 ){
                    bl = false;
                    break;
                }
            }
            if(bl){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
