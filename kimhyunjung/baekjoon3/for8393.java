package baekjoon3;

import java.util.Scanner;
//모르겠음

public class for8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=T; ++i){
            sum += i;
        }
        System.out.println(sum);
    }
}
