package baekjoon9;

import java.util.Scanner;

public class math4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A == 0 && B == 0 && C == 0) {
                break;
            }
            //Math.pow = 제곱함수 = (밑수 , 지수)
            int A2 = (int) Math.pow((double)A, (double)2);
            int B2 = (int) Math.pow((double)B, (double)2);
            int C2 = (int) Math.pow((double)C, (double)2);

            if(A2 + B2 == C2 || A2 + C2 == B2 || B2 + C2 == A2) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

        }
    }
}
/*
피타고라스 (가로값의 제곱 + 세로값의 제곱 = 빗변의 제곱)
(A*A) + (B*B) = (C*C);
 */