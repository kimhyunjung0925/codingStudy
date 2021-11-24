package boj;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i=1; i<=cnt; i++){
            String ox = sc.next();
            char[] c_arr = ox.toCharArray();
            int sum = 0, score = 0;
            for(int k=0; k<c_arr.length; k++) {
                if(c_arr[k]==('O')) {
                    score++;
                    sum += score;
                }
                    else {
                        score = 0;
                    }
            }
            System.out.println(sum);
        }
    }
}
