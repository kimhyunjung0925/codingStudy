package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nm = new int[10];
        int[] rem = new int[10];
        int cnt = 1;
        for(int i=0; i<nm.length; i++){
            nm[i] = sc.nextInt();
            rem[i] = nm[i] % 42;
        }
        Arrays.sort(rem);
        for(int i=0; i<rem.length-1; i++){
            if(rem[i] != rem[i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
