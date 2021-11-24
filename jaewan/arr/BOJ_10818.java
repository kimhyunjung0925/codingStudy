package boj;

import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] nm = new int[cnt];
        for(int i=0; i<nm.length; i++){
            nm[i] = sc.nextInt();
        }
        int max = nm[0];
        int min = nm[0];
        for(int i=0; i<nm.length; i++){
            if(nm[i] > max){
                max = nm[i];
            }
            if(nm[i] < min){
                min = nm[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
