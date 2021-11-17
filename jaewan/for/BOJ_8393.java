package boj;

import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
