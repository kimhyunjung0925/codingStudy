package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        char[] alpc = alp.toCharArray();
        for(int i=0; i<alpc.length; i++){
            int cnt=0;
            for(int j=0; j<c.length; j++){
                if(c[j]==alpc[i]){
                    System.out.print(j+" ");
                    break;
                }
                if(j==c.length-1){
                    if(c[j]!=alpc[i]){
                        System.out.print(--cnt+" ");
                    }
                }
            }
        }
    }
}
