package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) { //N=10일때 5kg 2개
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) { //N=11일때 5kg: 1개 3kg: 2개 총3개, N=18일때 5kg: 3개 3kg: 1개 총4개
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) { //N=12일때 3kg: 4개 총4개, N=19일때 5kg: 2개 3kg: 3개 총5개
            System.out.println((N / 5) + 2);
        }
    }
}
/*
그리디 알고리즘은 당장 눈앞에 보이는 최적의 상황을 쫓는 알고리즘으로 가장 단순한 형태의 알고리즘이다.
그리디 알고리즘의 대표적인 예제는 거스름 돈 문제이다. 우리가 흔히 거스름 돈을 줄때 가장 적은양의 화폐를 주는것이 편하다.
예를 들어 560원을 걸러주어야 할때 10원짜리 56개를 주는것보다 500원짜리 1개 50원짜리 1개 10원짜리 1개를 주는것이 총 3개로 더 편하다.
따라서 이런경우 무조건 더 큰 화폐 단위부터 거슬러 준다는 알고리즘만 지키면 최적의 해를 보장 할 수 있다.
*/
