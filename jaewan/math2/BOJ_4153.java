package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            if(num1 == 0 && num2 == 0 && num3 == 0){break;}
            if (num1 > num2 && num1 > num3) {
                if (Math.pow(num1, 2) == Math.pow(num2, 2) + Math.pow(num3, 2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
            if (num2 > num1 && num2 > num3) {
                if (Math.pow(num2, 2) == Math.pow(num1, 2) + Math.pow(num3, 2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
            if (num3 > num1 && num3 > num2) {
                if (Math.pow(num3, 2) == Math.pow(num1, 2) + Math.pow(num2, 2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
