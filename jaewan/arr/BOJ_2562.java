package boj;

import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nm = new int[9];
        int max = 0; int temp = 0;
        for(int i=0; i<nm.length; i++){
            nm[i] = sc.nextInt();
            if(nm[i] > max){
                max = nm[i];
                temp = i+1;
            }
        }
        System.out.println(max);
        System.out.println(temp);
    }
}
