package boj;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subs = sc.nextInt();
        int[] preSco = new int[subs];
        double[] newSco = new double[subs];
        int max = 0; double sum=0;
        for(int i=0; i<preSco.length; i++){
            preSco[i] = sc.nextInt();
            if(preSco[i] > max){
                max = preSco[i];
            }
        }
        for(int i=0; i<preSco.length; i++){
            newSco[i] = (double) preSco[i]/max*100;
            sum += newSco[i];
        }
        double avg = sum / subs;
        System.out.printf("%.2f", avg);
        sc.close();
    }
}
