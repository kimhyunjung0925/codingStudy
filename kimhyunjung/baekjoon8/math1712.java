package baekjoon8;

import java.util.Scanner;

public class math1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //고정비용
        int B = sc.nextInt(); //가변비용
        int C = sc.nextInt(); //판매비용
        int count = 0;

        if(B>=C) { // 판매비용보다 가변비용이 비싼경우
            System.out.println(-1);
        }
        else {
            count = A / (C - B); // 고정비용 / (판매 - 가변) = 몇개?
            System.out.println(count + 1); //이득 시작부분 +1
        }
    }
}
/*
손익분기점 (BREAK-EVEN POINT)
= 총비용 < 총수입
 */