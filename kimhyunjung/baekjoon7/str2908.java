package baekjoon7;

import java.awt.*;
import java.util.Scanner;

public class str2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        A = ((A % 10)*100) + ((A % 100)-(A % 10)) + (A / 100);
        B = ((B % 10)*100) + ((B % 100)-(B % 10)) + (B / 100);

        System.out.println(((A>B) ? A : B));
    }
}

/*
734
일의자리 -> 백의자리 = A % 10 * 100
십의자리 = 십의자리 = (A % 100)-(A % 10)
백의자리 -> 일의자리 = A / 100
 */

/*
-문자열로 변환 -> 못하겠음 그냥 자리만 바꿈

-마지막이 첫번째, 첫번째가 마지막으로 가도록 설정

-바꾼 수를 크기 비교해 큰 거 출력
A>B = A, A<B = B
((A>B) ? A : B)
 */