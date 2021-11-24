package boj;

import java.util.Scanner;

public class BOJ_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i=0; i<cnt; i++){
            double sum = 0;
            int stuNb = sc.nextInt();
            int[] score = new int[stuNb];
            for(int j=0; j<stuNb; j++){
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = sum / stuNb;
            double avgHi = 0;
            for(int k=0; k<stuNb; k++){
                if(score[k] > avg){
                    avgHi++;
                }
            }
            System.out.printf("%.3f%%\n", (avgHi/stuNb)*100);
        }
        sc.close();
    }
}
